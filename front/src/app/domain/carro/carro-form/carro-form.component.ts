import { GaragemService } from './../../garagem/garagem.service';
import { CarroService } from './../carro.service';
import { Carro } from './../carro';
import { Garagem } from './../../garagem/garagem';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import Validation from 'src/app/core/util/validation';
import { AlertService } from 'src/app/core/alert/alet.service';

@Component({
  selector: 'app-carro-form',
  templateUrl: './carro-form.component.html'
})
export class CarroFormComponent implements OnInit {
  
  carro: Carro;
  garagens: Garagem[];
  carroForm: FormGroup;
  titulo: string;

  constructor(
    private garagemService: GaragemService,
    private carroService: CarroService,
    private alertService: AlertService,
    private router: Router,
    private route: ActivatedRoute,
    private builder: FormBuilder
  ) {}

  ngOnInit() {
   
    this.carro = new Carro();

    
    this.carro.id = this.route.snapshot.params['id'];

    this.titulo = this.carro.id ? 'Editar' : 'Cadastrar';

  
    this.carroForm = this.builder.group(
      {
        id: [],
        fabricante: ['', Validators.required],
        versao: ['', Validators.required],
        descricao: ['', Validators.required],
        cor: ['', Validators.required],
        valor: ['', Validators.required],
        modelo: ['', Validators.required],
        garagem: ['', Validators.required]
      },
      {}
    );

   
    if (this.carro.id) {
      this.carroService.findById(this.carro.id).subscribe(carro => this.carroForm.patchValue(carro));
    }

    if (this.route.snapshot.url[0].path == 'visualizar') {
      
      this.carroForm.disable();

   
      this.titulo = 'Visualizar';
    }

    this.garagemService.findAll().subscribe(garagens => (this.garagens = garagens));
  }
  
  compareFn(c1, c2): boolean {
    return c1 && c2 ? c1.id === c2.id : c1 === c2;
  }

  
  onSave(carro: Carro) {

    if (this.carroForm.invalid) {
     
      Validation.allFormFields(this.carroForm);


      this.alertService.error('Por favor, preencha os campos obrigatórios!');
    } else {
      

     
      this.carroService.save(carro).subscribe(carro => {
  
        this.alertService.success('Carro salvo com sucesso!');

        this.router.navigate(['/carro']);
      });
    }
  }
}
