package com.test.springboot.javaBasic.javaBasic;

public class Concat {
	public static void main(String[] args) {
		System.out.println(concat("abc","cat"));
	}
	public static String concat(String a, String b) {
		System.out.println("a :"+a.charAt(a.length()-1));
		System.out.println("b :"+b.charAt(0));
		if (a.length()>0 && b.length()>0 ) {
			if (a.charAt(a.length()-1)==b.charAt(0) ) {
				return a.substring(0, a.length())+b.substring(1,b.length());
			} else {
				return a+b;
			}
		} else if (a.length()==0 && b.length()>0){
			return b;
		} else if (a.length()>0 && b.length()==0) {
			return a;
		} else {
			return "";
		}
		
	}

}
