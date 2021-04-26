package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
  private Integer Id;
  private String  Name;
  private Integer Phone;
  
  
public Employee(Integer id, String name, Integer phone) {
	super();
	Id = id;
	Name = name;
	Phone = phone;
}
public Integer getId() {
	return Id;
}
public void setId(Integer id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public Integer getPhone() {
	return Phone;
}
public void setPhone(Integer phone) {
	Phone = phone;
}
}
