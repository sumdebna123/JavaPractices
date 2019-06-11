package com.test.springboot.javaBasic.javaBasic;

public class LstCharSwap {
	public static void main(String[] args) {
		
	}
	
	public static String swapLastTwo(String str) {
		if (str.length()>=2) {
			return str.substring(0, (str.length()-2))+str.charAt(str.length()-1)+str.charAt(str.length()-2);
		} else {
			return str;
		}
	}

}
