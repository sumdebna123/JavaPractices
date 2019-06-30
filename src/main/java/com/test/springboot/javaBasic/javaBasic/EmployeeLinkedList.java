package com.test.springboot.javaBasic.javaBasic;

import java.util.EmptyStackException;

public class EmployeeLinkedList {
	private EmployeeNode head;
	
	public void addAtFront(Employee emp) {
		EmployeeNode node = new EmployeeNode(emp);
		node.setNode(head);
		head=node;
	}
	
	public void printLinkedList() {
		EmployeeNode current =head;
		System.out.print("HEAD ->");
		while (current !=null) {
			System.out.print(current.toString());
			System.out.print("->");
			current=current.getNext();
		}
		System.out.print("null");
	}

}
