import { EmpdataService } from './empdata.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NavbarComponent } from './navbar/navbar.component';
import { EmpoloyeeComponent } from './empoloyee/empoloyee.component';
import {MatMenuModule} from '@angular/material/menu';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatButtonModule} from '@angular/material/button';
import { AddempComponent } from './addemp/addemp.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomeComponent } from './home/home.component';
import {MatTableModule} from '@angular/material/table';
import { FooterComponent } from './footer/footer.component';
import { UpdateEmpComponent } from './update-emp/update-emp.component';
import {MatSnackBar, MatSnackBarModule} from '@angular/material/snack-bar';
@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    EmpoloyeeComponent,
    AddempComponent,
    HomeComponent,
    FooterComponent,
    UpdateEmpComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatMenuModule,
    MatButtonModule,
    MatToolbarModule,
    FormsModule,  
    ReactiveFormsModule,  
    HttpClientModule,
    MatTableModule,
    MatSnackBarModule
  ],
  providers: [EmpdataService,MatSnackBar],
  bootstrap: [AppComponent]
})
export class AppModule { }
