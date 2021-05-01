package com.app.customException;

@SuppressWarnings("serial")
public class EmployeeNotFound extends RuntimeException {
	public EmployeeNotFound(String mesg) {
		super(mesg);
	}

}
