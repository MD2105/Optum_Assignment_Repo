package com.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table
@JsonInclude
public class Employee {
	@Id
	
	@JsonProperty("emp_id")
    private Integer Id;
	@JsonProperty("emp_name")
    private String  Name;
	@JsonProperty("emp_phone")
    private long Phone;
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
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public Employee(Integer id, String name, long phone) {
		super();
		Id = id;
		Name = name;
		Phone = phone;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Phone=" + Phone + "]";
	}
  public Employee() {
	  
  }
  
}
