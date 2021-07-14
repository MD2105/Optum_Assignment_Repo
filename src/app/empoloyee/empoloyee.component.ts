import { Employees } from './../employees';
import { Component, OnInit, ViewChild } from '@angular/core';
import { EmpdataService } from '../empdata.service';
import { Router } from '@angular/router';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { AfterViewInit } from '@angular/core';

@Component({
  selector: 'app-empoloyee',
  templateUrl: './empoloyee.component.html',
  styleUrls: ['./empoloyee.component.css']
})
export class EmpoloyeeComponent implements AfterViewInit {

  ELEMENT_DATA!: Employees[];
  displayedColumns: string[] = ['EmployeeId', 'Employee Name', 'Employee Number', 'Operations'];
  dataSource = new MatTableDataSource<Employees>(this.ELEMENT_DATA);
  @ViewChild(MatPaginator)
  paginator!: MatPaginator;
  emp:any;
  constructor(private service:EmpdataService, private router: Router) { }
  ngAfterViewInit(){
    this.dataSource.paginator = this.paginator;
  }
  ngOnInit(){
    this.getdata();
  }
  public getdata(){
    let resp=this.service.getAllEmpdata();
    resp.subscribe(record=>this.dataSource.data=record as Employees[]);
  } 

  public deleteEmp(id:number){
    let resp= this.service.removeEmp(id);
    resp.subscribe(record=>this.dataSource.data=record as Employees[]);
   }
  
   public getEmp(id:number){
    this.router.navigate(['/update',id]);
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }
   }

