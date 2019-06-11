package com.test.springboot.javaBasic.javaBasic;

public class MethodOverload {
	public static void main(String[] args) {
		MethodOverload obj = new MethodOverload();
		System.out.println(obj.add(3.2, 4.3));
		
	}
	public int add(int a, int b) {
		return a+b;
	}
	public double add(double a,double b) {
		return a+b;
	}
	public float add(float a,float b) {
		return a+b;
	}

}
