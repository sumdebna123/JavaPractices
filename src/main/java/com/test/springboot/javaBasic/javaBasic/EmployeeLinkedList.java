package com.test.springboot.javaBasic.javaBasic;

public class EmployeeLinkedList {
	private EmployeeNode head;
	private int size;

	public void addAtFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNode(head);
		head = node;
	}

	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}

	public void printLinkedList() {
		EmployeeNode current = head;
		System.out.print("HEAD ->");
		while (current != null) {
			System.out.print(current.toString());
			System.out.print("->");
			current = current.getNext();
		}
		System.out.print("null");
	}

	public EmployeeNode removeFromFront() {
		if (isEmpty()) {
			return null;
		}

		EmployeeNode removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while (current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}

}
