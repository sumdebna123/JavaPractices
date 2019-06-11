package com.test.springboot.javaBasic.javaBasic;

public class MakeDoubleChar {
	public static void main(String[] args) {
		System.out.println("The return string is :"+doubleChar("sumit"));

	}

	public static String doubleChar(String str) {
		String returnString = "";
		for (int i = 0; i < str.length(); i++) {
			returnString = returnString + str.charAt(i) + str.charAt(i);
		}
		return returnString;

	}

}
