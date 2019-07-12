package com.leedcode.prac.test;

public class ReverseOrderOfASentence {
	public static void main(String[] args) {
		String str = "Hello World";
		
		String[] arr= str.split(" ");
		String returnStr="";
		for (int i = arr.length-1;i>=0;i--) {
			returnStr=returnStr+arr[i]+" ";
		}
		System.out.println(returnStr);
	}

}
