import { NgModule } from '@angular/core';
import { NumberValueAccessor } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { NeweducacionComponent } from './component/educacion/neweducacion.component';
import { EditExpeComponent } from './component/expe-laboral/edit-expe/edit-expe.component';
import { NewExperienciaComponent } from './component/expe-laboral/new-experiencia.component';
import { LoginComponent } from './component/login/login.component';
import { PortfolioComponent } from './component/portfolio/portfolio.component';

const routes: Routes = [
  {path:'',component:PortfolioComponent},
  {path:'login',component:LoginComponent},
  {path:'nuevaexp', component: NewExperienciaComponent},
  {path:'editExp/:id', component: EditExpeComponent},
  {path:'nuevaedu', component: NeweducacionComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
