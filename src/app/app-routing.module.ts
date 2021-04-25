import { AddempComponent } from './addemp/addemp.component';
import { EmpoloyeeComponent } from './empoloyee/empoloyee.component';
import { NavbarComponent } from './navbar/navbar.component';
import { componentFactoryName } from '@angular/compiler';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
  {
    path:'Empoloyee',
    component:EmpoloyeeComponent
  },
  {
    path:'addemp',
    component:AddempComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
