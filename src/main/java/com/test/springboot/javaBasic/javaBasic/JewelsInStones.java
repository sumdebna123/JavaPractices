package com.test.springboot.javaBasic.javaBasic;

public class JewelsInStones {
	public static void main(String[] args) {
		String j ="aA";
		String s="aAAbbbb";
		System.out.println("j length():"+j.length());
		System.out.println("j length():"+s.length());
		int count =0;

		for (int i=0;i<j.length();i++) {
			for (int k=0;k<s.length();k++) {
				System.out.println("The value S:"+s.charAt(k));
				System.out.println("The value J:"+j.charAt(i));
			}
		}
		
	}

}
