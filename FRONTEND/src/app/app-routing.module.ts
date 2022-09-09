import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditeducacionComponent } from './component/educacion/editeducacion.component';
import { NeweducacionComponent } from './component/educacion/neweducacion.component';
import { EditExpeComponent } from './component/expe-laboral/edit-expe/edit-expe.component';
import { NewExperienciaComponent } from './component/expe-laboral/new-experiencia.component';
import { homeComponent } from './component/home/home.component';
import { LoginComponent } from './component/login/login.component';


const routes: Routes = [
  {path:'',component:homeComponent},
  {path:'login',component:LoginComponent},
  {path:'nuevaexp', component: NewExperienciaComponent},
  {path:'editExp/:id', component: EditExpeComponent},
  {path:'nuevaedu', component: NeweducacionComponent},
  {path:'editedu/:id', component: EditeducacionComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
