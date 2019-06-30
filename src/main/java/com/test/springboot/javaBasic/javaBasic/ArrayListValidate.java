package com.test.springboot.javaBasic.javaBasic;

import java.util.List;
import java.util.ArrayList;;

public class ArrayListValidate {
	public static void main(String[] args) {
		Employee emp1 = new Employee("001", "Sumit", "Debnath");
		Employee emp2 = new Employee("002", "Moumita", "Debnath");
		List<Employee> arrayList =  new ArrayList<Employee>();
		arrayList.add(emp1);
		arrayList.add(emp2);
		arrayList.forEach(Employee->System.out.println(Employee.toString()));
		System.out.println(arrayList.get(0).toString());
	}
}
