package com.leedcode.prac.test;

import java.util.Arrays;

public class AnagramCheck {
	public static void main(String[] args) {
		String s1="sumit";
		String s2="timus";
		if (s1.length()!=s2.length()) {
			System.out.println("Not a Anagram");
		} else {
			char[] c1= s1.toCharArray();
			Arrays.sort(c1);
			String sortedS1=new String(c1);
			System.out.println(c1.toString());
			System.out.println(sortedS1);
			
			char[] c2= s2.toCharArray();
			Arrays.sort(c2);
			String sortedS2=new String(c1);
			
			System.out.println(sortedS2);
			
			if (sortedS2.equals(sortedS1)) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not a Anagram");
			}
			
		}
	}



}
