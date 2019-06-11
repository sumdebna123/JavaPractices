package com.test.springboot.javaBasic.javaBasic;

public class MinCat {
	public static void main(String[] args) {
		System.out.println("The return value :"+minCat("Hello", "Hihshshshsh"));
	}
	
	public static String minCat(String a, String b) {
		if (a.length()>=b.length()) {
			return a.substring((a.length()-b.length()), a.length())+b;
		} else {
			return a+b.substring((b.length()-a.length()), b.length()); 
		}
	}
}
