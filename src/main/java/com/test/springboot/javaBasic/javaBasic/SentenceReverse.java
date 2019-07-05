package com.test.springboot.javaBasic.javaBasic;

public class SentenceReverse {
	public static void main(String[] args) {
		
		String inputStr = "I am Sumit Debnath";
		String[] strArray = inputStr.split(" ");
		for (int i = strArray.length-1;i>=0;i--) {
			System.out.print(strArray[i]+" ");
		}
	}
}
