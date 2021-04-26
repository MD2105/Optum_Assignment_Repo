package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.IEmpService;

@RestController
@CrossOrigin
@RequestMapping("/emp")
public class CrudController {
   public CrudController() {
	   System.out.print("In Crud Controller");
   }
  
   @Autowired
  private IEmpService serv;
   @GetMapping
   public List<Employee> getallEmp(){
	   System.out.println("In List of All employee");
	   return serv.getallEmp();
   }
   
   @PostMapping("/create")
   public ResponseEntity<?> Addemp(@RequestBody Employee e)
   {
	   System.out.println("In Creation of Employee");
	   try {
		   Employee emp = serv.createEmp(e);
		   return new ResponseEntity<>(emp,HttpStatus.CREATED);
	   }catch (RuntimeException e1)
	   {
		   System.out.print("eror is "+e1);
		   return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	   }
   }
	   
	 @DeleteMapping("/delete/{id}")
	 public List<Employee> delemp(@PathVariable int id){
		 return serv.removeEmp(id);
	 }
	   
   
}
