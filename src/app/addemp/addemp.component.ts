import { MatSnackBar } from '@angular/material/snack-bar';
import { EmpdataService } from './../empdata.service';
import { Employees } from './../employees';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'addemp',
  templateUrl: './addemp.component.html',
  styleUrls: ['./addemp.component.css']
})


export class AddempComponent implements OnInit {

  user:Employees = new Employees();
  message:any;

  constructor(private service:EmpdataService,private matsnk:MatSnackBar) { }

 
  ngOnInit(): void {
  }
  public registerNow(){
   console.log(this.user);
    let resp=this.service.empRegistration(this.user);
    resp.subscribe((data)=>this.message=data);
    this.matsnk.open(this.user.emp_name+" You are registered","Okay");
      }
    

}

