package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojo.Employee;

public interface IEmpService {
  public List<Employee> getallEmp();
  public Employee createEmp(Employee emp);
  public List<Employee> removeEmp(int id);
}
 