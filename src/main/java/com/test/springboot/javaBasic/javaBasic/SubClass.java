package com.test.springboot.javaBasic.javaBasic;

public class SubClass extends SuperClass1{
	public SubClass() {
		System.out.println("This is Sub1");
	}
	public static void main(String[] args) {
		SuperClass1 obj = new SubClass();
		System.out.println("This is demo");
		
	}
	

}
