package com.test.springboot.javaBasic.javaBasic;

public class CountSubString {
	public static void main(String[] args) {
		System.out.println("This is return :"+countSubStirng("hi this is hi"));
	}
	
	public static int countSubStirng(String str) {
		int counter =0;
		for (int i=0;i<(str.length()-1);i++) {
			String s=""+str.charAt(i)+str.charAt(i+1);
			System.out.println("concat of char :"+s);
			if ("hi".equalsIgnoreCase(s)) {
				counter++;
			}
		}
		return counter;
	}

}
