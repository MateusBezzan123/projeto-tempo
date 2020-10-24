import { GaragemService } from '../garagem.service';
import { Garagem } from '../garagem';
import { Component, OnInit } from '@angular/core';

import { AlertService } from 'src/app/core/alert/alet.service';

@Component({
  selector: 'app-garagem-list',
  templateUrl: './garagem-list.component.html',

})
export class GaragemListComponent implements OnInit {
  
  garagens: Garagem[];

  constructor(private garagemService: GaragemService, private alertService: AlertService) {}

  ngOnInit() {
    
    this.garagemService.findAll().subscribe(garagens => (this.garagens = garagens));
  }


  onDelete(id: number) {
    
    this.garagemService.deteleById(id).subscribe(() => {

      this.garagens = this.garagens.filter(garagem => garagem.id !== id);

      this.alertService.success('Garagem excluída com sucesso!');
    });
  }
}
