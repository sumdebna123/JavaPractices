package com.test.springboot.javaBasic.javaBasic;

public class CallingInterface extends DemoAbstract implements DemoInterface{
	public static void main(String[] args) {
		CallingInterface obj = new CallingInterface();
		obj.print();
		System.out.println(obj.sum(3,4));
		obj.print("abc");
		obj.multiple(3, 2);
		
	}

//	public void print() {
//		System.out.println("This is test");
//		
//	}

	public int sum(int a, int b) {
		return a+b;
	}

	@Override
	public void multiple(int a, int b) {
		System.out.println(a*b);
		
	}

}
