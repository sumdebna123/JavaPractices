package com.test.springboot.javaBasic.javaBasic;

public class Prac1 {
	public static void main(String[] args) {
		Prac1 obj = new Prac1();
		obj.test("This is demo");
		test.createObj().myMethod("demo");
	}
	public void test(String s) {
		System.out.println(s);
	}
	

}

class test{
	private test() {
	}

	public static test createObj() {
		return new test();
	}
	public void myMethod(String s) {
		System.out.println(s);
	}
}
