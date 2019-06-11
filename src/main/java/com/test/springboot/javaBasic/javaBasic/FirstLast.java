package com.test.springboot.javaBasic.javaBasic;

public class FirstLast {
	public static void main(String[] args) {
		String str ="hi";
		String str1="vo";
		System.out.println(firstLast(str,str1));
	}
	
	public static String firstLast(String a, String b) {

		if (a.length()>=1 && b.length()>=1) {
			return a.substring(0, 1)+b.substring(b.length()-1,b.length());
		} else if (a.length()>1 && b.length()==0) {
			return a.substring(0, 1)+"@";
		} else if (a.length()==0 && b.length()>=1){
			return "@"+b.substring(b.length()-1,b.length());
		} else {
			return "@@";
		}
	}
}
