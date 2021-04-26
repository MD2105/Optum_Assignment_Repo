package com.app.service;

import java.util.List;

import com.app.pojo.Employee;

public interface IEmpService {
  public List<Employee> getallEmp();
  public Employee createEmp(Employee emp);
}
