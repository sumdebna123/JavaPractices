package com.test.springboot.javaBasic.javaBasic;

public class EmployeeNode {
	private Employee emp;
	private EmployeeNode next;

	public EmployeeNode(Employee emp) {
		super();
		this.emp = emp;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public EmployeeNode getNode() {
		return next;
	}

	public void setNode(EmployeeNode node) {
		this.next = node;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public String toString() {
		return emp.toString();
	}

}
