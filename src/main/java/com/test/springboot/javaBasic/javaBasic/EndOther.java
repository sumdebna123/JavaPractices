package com.test.springboot.javaBasic.javaBasic;

public class EndOther {
	public static void main(String[] args) {
		
	}
	public static boolean endOther(String a, String b) {
		if (a.length()>b.length()) {
			return a.toUpperCase().endsWith(b.toUpperCase());
		} else {
			return b.toUpperCase().endsWith(a.toUpperCase());
		}
	}

}
