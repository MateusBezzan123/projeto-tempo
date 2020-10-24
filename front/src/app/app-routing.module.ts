import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  { path: 'pais', loadChildren: './domain/pais/pais.module#PaisModule' },
  { path: 'garagem', loadChildren: './domain/garagem/garagem.module#GaragemModule' },
  { path: 'carro', loadChildren: './domain/carro/carro.module#CarroModule' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
