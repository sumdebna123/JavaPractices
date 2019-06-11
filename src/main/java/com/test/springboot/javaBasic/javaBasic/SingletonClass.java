package com.test.springboot.javaBasic.javaBasic;

class SingletonClass {
	private SingletonClass() {
		System.out.println("I am inside the single ton class.");
		
	}
	public static SingletonClass callClass() {
		return new SingletonClass();
	}

}
