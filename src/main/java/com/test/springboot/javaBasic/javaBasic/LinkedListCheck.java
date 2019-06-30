package com.test.springboot.javaBasic.javaBasic;

public class LinkedListCheck {
	public static void main(String[] args) {
		Employee emp1 = new Employee("001", "Sumit", "Debnath");
		Employee emp2 = new Employee("002", "Moumita", "Debnath");
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addAtFront(emp1);
		list.addAtFront(emp2);
		list.printLinkedList();
	}

}
