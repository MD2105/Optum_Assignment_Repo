
import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmpdataService {

  constructor(private http:HttpClient) { }

public empRegistration(user:any){
  return this.http.post("http://localhost:8080/empdata/create",user);
}
public getAllEmpdata(){
  return this.http.get("http://localhost:8080/empdata/");
}
public removeEmp(id:number){
  return this.http.delete("http://localhost:8080/empdata/delete/"+id);
}
public empUdaptedata(user:any){
  return this.http.put("http://localhost:8080/empdata/update",user);
}
getEmployee(id: number): Observable<any> {
  return this.http.get("http://localhost:8080/empdata/get/"+id);
}
}
