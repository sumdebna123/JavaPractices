package com.test.springboot.javaBasic.javaBasic;

public class ReverseWordInString {
	public String reverseWords(String s) {
		String[] listOfWrd=s.trim().split(" ");
		String newStr ="";
		for(int i=listOfWrd.length-1;i>=0;i--) {
			if (i==0) {
				newStr=newStr+listOfWrd[i];
			} else {
				newStr=newStr+listOfWrd[i]+" ";
			}
			System.out.println(newStr);
		}
		return newStr;

	}
	
	public static void main(String[] args) {
		ReverseWordInString obj=new ReverseWordInString();
		System.out.println(obj.reverseWords("the sky is blue"));
		
	}

}
