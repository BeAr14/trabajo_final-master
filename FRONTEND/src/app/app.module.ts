import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { LogoAPComponent } from './component/logo-ap/logo-ap.component';
import { BannerComponent } from './component/banner/banner.component';
import { AcercaDeComponent } from './component/acerca-de/acerca-de.component';
import { ExpeLaboralComponent } from './component/expe-laboral/expe-laboral.component';
import { EducacionComponent } from './component/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardComponent } from './component/hard/hard.component';
import { ProyectosComponent } from './component/proyectos/proyectos.component';
import { IdiomasComponent } from './component/idiomas/idiomas.component';
import { FooterComponent } from './component/footer/footer.component';
import { LoginComponent } from './component/login/login.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { interceptorProvider } from './servicios/interceptor-service';
import { NewExperienciaComponent } from './component/expe-laboral/new-experiencia.component';
import { EditExpeComponent } from './component/expe-laboral/edit-expe/edit-expe.component';
import { NeweducacionComponent } from './component/educacion/neweducacion.component';
import { EditeducacionComponent } from './component/educacion/editeducacion.component';
import { homeComponent } from './component/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    BannerComponent,
    AcercaDeComponent,
    ExpeLaboralComponent,
    EducacionComponent,
    HardComponent,
    ProyectosComponent,
    IdiomasComponent,
    FooterComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditExpeComponent,
    NeweducacionComponent,
    EditeducacionComponent,
    homeComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    FormsModule,
    HttpClientModule,
  
  ],
  providers: [
    interceptorProvider
  ],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
