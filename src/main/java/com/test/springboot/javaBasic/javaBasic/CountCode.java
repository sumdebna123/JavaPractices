package com.test.springboot.javaBasic.javaBasic;

public class CountCode {
	public static void main(String[] args) {
		System.out.println(countCode("cozexxcope"));
		
	}
	public static int countCode(String str) {
		int counter =0;
		for (int i=0;i<str.length()-3;i++) {
			if (str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e') {
				counter++;
			}
		}
		return counter;
	}

}
