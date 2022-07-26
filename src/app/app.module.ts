import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { LogoAPComponent } from './component/logo-ap/logo-ap.component';
import { RedesocialComponent } from './component/redesocial/redesocial.component';
import { BannerComponent } from './component/banner/banner.component';
import { AcercaDeComponent } from './component/acerca-de/acerca-de.component';
import { ExpeLaboralComponent } from './component/expe-laboral/expe-laboral.component';
import { EducacionComponent } from './component/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardComponent } from './component/hard/hard.component';
import { ProyectosComponent } from './component/proyectos/proyectos.component';
import { IdiomasComponent } from './component/idiomas/idiomas.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    RedesocialComponent,
    BannerComponent,
    AcercaDeComponent,
    ExpeLaboralComponent,
    EducacionComponent,
    HardComponent,
    ProyectosComponent,
    IdiomasComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
