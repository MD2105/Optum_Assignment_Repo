package com.app.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.IEmpService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/empdata")
public class EmployeeDataController {
   public EmployeeDataController() {
	   System.out.print("In Crud Controller");
   }
  
   @Autowired
  private IEmpService serv;
   @GetMapping
   public ResponseEntity<?> getallEmployee(){
	   System.out.println("In List of All employee");
	   List<Employee> emp = serv.getallEmp();

	   if (emp.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<>(emp, HttpStatus.OK);
   }

   @PostMapping("/create")
   public String createEmployee(@RequestBody Employee e)
   {
	   System.out.println("In Creation of Employee");
	   System.out.println("name"+e.getName());
	   serv.createEmp(e);
	   return "Created successfully";
   }
	   
	 @DeleteMapping("/delete/{id}")
	     public List<Employee> deleteEmployee(@PathVariable int id){
		 return serv.removeEmp(id);
	 }
	   
   @PutMapping("/update")
      public List<Employee> updateEmployee(@RequestBody Employee e) {  
         System.out.print("in update");
       return serv.updateEmp(e);
   }
   
   @GetMapping("/get/{id}")
	public ResponseEntity<?> getEmployeeDetails(@PathVariable int id) {
		System.out.println("in get product dtls " + id);
		try {
			return ResponseEntity.ok(serv.getEmployeeDetails(id));
		} catch (RuntimeException e) {
			System.out.println("err in controller " + e);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
}
