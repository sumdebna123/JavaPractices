package com.test.springboot.javaBasic.javaBasic;

import java.util.LinkedList;
import java.util.List;

public class LinkedListByInbuildMethod {
	public static void main(String[] args) {
		Employee jhon = new Employee("12", "Jhon", "White");
		Employee jim = new Employee("13", "Jim", "Wood");
		Employee jeff = new Employee("14", "Real", "Anderson");
		
		List<Employee> myList = new LinkedList<Employee>();
		myList.add(jhon);
		myList.add(jim);
		myList.add(jeff);
		
		for (Employee e : myList) {
			System.out.println(e.toString());
		}
		

	}

}
