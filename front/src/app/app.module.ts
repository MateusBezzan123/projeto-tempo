import { CarroModule } from './domain/carro/carro.module';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
import { CoreModule } from './core/core.module';
import { GaragemModule } from './domain/garagem/garagem.module';


@NgModule({
  declarations: [AppComponent ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    NgbModule,
    CoreModule,
    GaragemModule,
    CarroModule,
   
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
