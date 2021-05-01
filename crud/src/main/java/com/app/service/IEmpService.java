package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.pojo.Employee;

public interface IEmpService {
  public List<Employee> getallEmp();
  public void createEmp(Employee emp);
  public List<Employee> removeEmp(int id);
  public List<Employee> updateEmp(Employee e);
  public Employee getEmployeeDetails(int emp_id);
}
 