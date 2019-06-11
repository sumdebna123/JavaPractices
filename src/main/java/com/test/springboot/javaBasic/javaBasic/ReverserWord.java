package com.test.springboot.javaBasic.javaBasic;

/*
 * 
 * 
 * https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
 */
		
		

public class ReverserWord {
	public static void main(String[] args) {
		System.out.println(reverseSentence("i.like.this.program.very.much"));
		
	}
	public static String reverseSentence(String str) {
		
		String[] strArray = str.split("\\.");
		String retrunStr="";
		for (int i=strArray.length-1;i>=0;i--) {
			if (i !=0) {
				retrunStr=retrunStr+strArray[i]+".";
			} else {
				retrunStr=retrunStr+strArray[i];
			}
		}
		return retrunStr;
		
	}

}
