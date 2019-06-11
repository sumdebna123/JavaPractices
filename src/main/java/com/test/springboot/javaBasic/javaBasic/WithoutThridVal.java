package com.test.springboot.javaBasic.javaBasic;

public class WithoutThridVal {
	public static void main(String[] args) {
		int firstVal= 5;
		int secondVal = 6;
		
		firstVal = firstVal+secondVal;
		secondVal= firstVal-secondVal; 
		firstVal = firstVal-secondVal;
		System.out.println("second value :"+secondVal);
		System.out.println("first value :"+firstVal);

		
	}

}
