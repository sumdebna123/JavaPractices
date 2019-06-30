package com.test.springboot.javaBasic.javaBasic;

public class Employee {
	String empId;
	String empFirstName;
	String empLastName;
	
	
	public Employee(String empId, String empFirstName, String empLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}
	
	
	

}
