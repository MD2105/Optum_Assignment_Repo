package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojo.Employee;
import com.app.repo.EmployeeRepo;
@Service
@Transactional
public class EmpService implements IEmpService {

	
	@Autowired 
	private EmployeeRepo repo;
	@Override
	public List<Employee> getallEmp() {
		return repo.findAll();
		
	}

	@Override
	public Employee createEmp(Employee emp) {
		Employee e = repo.save(emp);
		return e;
	}

}
