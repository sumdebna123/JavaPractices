package com.leedcode.prac.test;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("A man, a plan, a canal: Panama"));
		
	}
	
	public static boolean checkPalindrome(String s) {
		s = s.trim().replaceAll("[^a-zA-Z0-9\\s+]","");
		s=s.replaceAll("\\s+","").toLowerCase();
		
		char[] ch =s.toCharArray();
		
		for (int i=0;i<ch.length/2;i++) {
			if (ch[i]!=ch[ch.length-1-i]) {
				return false;
			}
		}
		return true;
		
	}

}
