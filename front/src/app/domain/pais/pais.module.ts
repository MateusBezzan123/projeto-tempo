import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PaisRoutingModule } from './pais-routing.module';
import { PaisListComponent } from './pais-list/pais-list.component';
import { PaisFormComponent } from './pais-form/pais-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CoreModule } from 'src/app/core/core.module';

@NgModule({
  declarations: [
    PaisListComponent, 
    PaisFormComponent
  ],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    CoreModule,
    PaisRoutingModule
  ]
})
export class PaisModule { }
