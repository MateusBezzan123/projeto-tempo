import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { GaragemFormComponent } from './garagem-form/garagem-form.component';
import { ReactiveFormsModule } from '@angular/forms';
import { CoreModule } from 'src/app/core/core.module';
import { GaragemListComponent } from './garagem-list/garagem-list-component';
import { GaragemRoutingModule } from './garagem-routing.module';

@NgModule({
  declarations: [GaragemFormComponent, GaragemListComponent],
  imports: [CommonModule, ReactiveFormsModule, CoreModule, GaragemRoutingModule]
})
export class GaragemModule {}
