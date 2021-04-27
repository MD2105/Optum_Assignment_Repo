package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer Id;
  private String  Name;
  private Integer Phone;
  
  public Employee() {
	  
  }
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
