import { UpdateEmpComponent } from './update-emp/update-emp.component';
import { HomeComponent } from './home/home.component';
import { AddempComponent } from './addemp/addemp.component';
import { EmpoloyeeComponent } from './empoloyee/empoloyee.component';
import { NavbarComponent } from './navbar/navbar.component';
import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {path:'',redirectTo:'/Home',pathMatch:'full'},
  {path:'Home',component:HomeComponent},
  {
    path:'Empoloyee',
    component:EmpoloyeeComponent
  },
  {
    path:'addemp',
    component:AddempComponent
  },
  {
    path:'update',
    component:UpdateEmpComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
