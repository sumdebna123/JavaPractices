package com.leetcode.prac;

public class ReverseWordInASentence {
	public static void main(String[] args) {
		
		System.out.println(returnString("Let's take LeetCode contest"));
		
	}
	
	public static String returnString(String s) {
		String[] strArray = s.split(" ");
		String outputStr ="";
		for (int i =0;i<strArray.length;i++) {
			String tempStr = new StringBuilder(strArray[i]).reverse().toString();
			
			outputStr=outputStr+" "+tempStr;
		}
		return outputStr.trim();
	}

}
