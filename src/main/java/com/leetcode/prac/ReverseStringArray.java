package com.leetcode.prac;

public class ReverseStringArray {
	public static void main(String[] args) {
		String[] s= {"a","b","c"};
		reverseStrArray(s);
		
	}
	
	public static void reverseStrArray(String[] str) {
		int length = str.length;
		String[] outputArray = new String[length];
		
		for (int i =0;i<length;i++) {
			outputArray[length-1-i]=str[i];
		}
		for (String s:outputArray) {
			System.out.print("\""+s+"\",");
			
		}
	}

}
