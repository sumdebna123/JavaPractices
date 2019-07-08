package com.test.springboot.javaBasic.javaBasic;

class MyRunner extends Thread {
	@Override
	public void run() {
		System.out.println("This is my demo");
	}
}

class MyRun implements Runnable{
	@Override
	public void run() {
		System.out.println("This is my demo1");
	}
}

public class MyThreadClass {
	public static void main(String[] args) {
		MyRunner obj = new MyRunner();
		obj.start();
		
		MyRunner obj1 = new MyRunner();
		obj1.start();
		
		Thread obj2 = new Thread(new MyRun());
		obj2.start();
		
		
		
	}

}
