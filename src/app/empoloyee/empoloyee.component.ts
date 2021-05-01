import { Employees } from './../employees';
import { Component, OnInit } from '@angular/core';
import { EmpdataService } from '../empdata.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-empoloyee',
  templateUrl: './empoloyee.component.html',
  styleUrls: ['./empoloyee.component.css']
})
export class EmpoloyeeComponent implements OnInit {

  allemp:any;

  constructor(private service:EmpdataService, private router: Router) { }

  ngOnInit() {
  
    let resp=this.service.getAllEmpdata();
    resp.subscribe((data)=>this.allemp=data);
  
  }
  public delteEmp(id:number){
    let resp= this.service.removeEmp(id);
    resp.subscribe((data)=>this.allemp=data);
   }
  
   public getEmp(emp:Employees){
    this.router.navigate(['update', emp]);
  }
   }

