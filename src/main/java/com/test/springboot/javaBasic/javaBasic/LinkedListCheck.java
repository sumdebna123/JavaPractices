package com.test.springboot.javaBasic.javaBasic;

public class LinkedListCheck {
	public static void main(String[] args) {
		Employee emp1 = new Employee("001", "Sumit", "Debnath");
		Employee emp2 = new Employee("002", "Moumita", "Debnath");
		Employee emp3 = new Employee("003", "Ishayu", "Debnath");
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(emp1);
		list.addToFront(emp2);
		list.addToFront(emp3);
		list.printLinkedList();
		System.out.println("\nSize :"+list.getSize());
	}

}
