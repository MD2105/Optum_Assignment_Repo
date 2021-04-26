package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Employee;
import com.app.service.IEmpService;

@RestController
@CrossOrigin
public class CrudController {
   public CrudController() {
	   System.out.print("In Crud Controller");
   }
  
   @Autowired
  private IEmpService serv;
   @RequestMapping
   public List<Employee> getallEmp(){
	   return serv.getallEmp();
   }
   
   
}
