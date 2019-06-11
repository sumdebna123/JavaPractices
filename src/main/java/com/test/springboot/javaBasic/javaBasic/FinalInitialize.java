package com.test.springboot.javaBasic.javaBasic;

public class FinalInitialize {
	private final String str; 
	
	public FinalInitialize() {
		str="test";
		System.out.println("This is final debo :"+str);
	}
	
	public static void main(String[] args) {
		FinalInitialize obj1= new FinalInitialize();
		
	} 
	

}
