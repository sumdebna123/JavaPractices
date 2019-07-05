package com.test.springboot.javaBasic.javaBasic;

public class ThreadingConcept extends Thread{
	
	public void run() {
		System.out.println("I am here");
	}
	public static void main(String[] args) {
		ThreadingConcept obj = new ThreadingConcept();
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getContextClassLoader());
		System.out.println(Thread.currentThread().getState());
		
		obj.run();
	}

}
