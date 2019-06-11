package com.test.springboot.javaBasic.javaBasic;

public class FirstTwoChar {
	public static void main(String[] args) {
		String str ="";
		System.out.println(atFirst(str));
	}
	
	public static String atFirst(String str) {

		if (str.length()<2) {
			for (int i=0;i<=(2-str.length());i++) {
				str=str+"@";
			}
		} else {
			str=str.substring(0,2);
		}
		return str;
	}
}


