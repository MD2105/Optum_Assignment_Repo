import { Employees } from './../employees';
import { Component, OnInit } from '@angular/core';
import { EmpdataService } from '../empdata.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'update',
  templateUrl: './update-emp.component.html',
  styleUrls: ['./update-emp.component.css']
})
export class UpdateEmpComponent implements OnInit {

   id!: number;
   updtemp!: Employees;
  constructor(private empservice:EmpdataService,private route: ActivatedRoute,private router: Router) { }

  ngOnInit() {
    this.updtemp = new Employees();
    this.id = this.route.snapshot.params['id'];
    this.empservice.getEmployee(this.id)
    .subscribe(data => {
      console.log(data)
      this.updtemp = data;
    }, (error: any) => console.log(error));

  }
  updateEmployee() {
    this.empservice.empUdaptedata(this.updtemp)
      .subscribe(data => console.log(data), error => console.log(error));
      this.updtemp = new Employees();
      this.gotoList();
  }
  onSubmit() {
    this.updateEmployee();    
  }

  gotoList() {
    this.router.navigate(['/Empoloyee']);
  }

}


