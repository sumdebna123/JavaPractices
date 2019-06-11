package com.test.springboot.javaBasic.javaBasic;

public class StringIntro {
	public static void main(String[] args) {
		
		String A ="vuu";
		String B = "vuuuuu";
		
		System.out.println(A.length()+B.length());
		int fValue = A.charAt(0);
		int sValue = B.charAt(0);
		if (fValue > sValue) System.out.println("Yes");
		else  System.out.println("No");

		
//		if (A.length()<=B.length()) System.out.println("No");
//		else System.out.println("Yes");
		System.out.print(Character.toString(A.charAt(0)).toUpperCase()+A.substring(1, A.length()));
		System.out.print(" ");
		System.out.print(Character.toString(B.charAt(0)).toUpperCase()+B.substring(1, B.length()));
	}
	
	

}
