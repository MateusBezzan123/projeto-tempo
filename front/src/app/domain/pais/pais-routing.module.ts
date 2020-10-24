
import { PaisListComponent } from './pais-list/pais-list.component';
import { PaisFormComponent } from './pais-form/pais-form.component';
import { Routes, RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';

const routes: Routes = [
  { path: '', component: PaisListComponent },
  { path: 'novo', component: PaisFormComponent },
  { path: 'editar/:id', component: PaisFormComponent },
  { path: 'visualizar/:id', component: PaisFormComponent }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PaisRoutingModule { }
