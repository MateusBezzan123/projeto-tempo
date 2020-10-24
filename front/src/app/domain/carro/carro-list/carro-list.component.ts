import { Component, OnInit } from '@angular/core';

import { AlertService } from 'src/app/core/alert/alet.service';
import { Carro } from '../carro';
import {CarroService} from '../carro.service';

@Component({
  selector: 'app-carro-list',
  templateUrl: './carro-list.component.html'
})
export class CarroListComponent implements OnInit {

  carros: Carro[];

  constructor(private carroService: CarroService, private alertService: AlertService) {}

  ngOnInit() {

    this.carroService.findAll().subscribe(carros => (this.carros = carros));
  }


  onDelete(id: number) {
    
    this.carroService.deteleById(id).subscribe(() => {
     
      this.carros = this.carros.filter(carro => carro.id !== id);

      this.alertService.success('Carro excluída com sucesso!');
    });
  }
}
