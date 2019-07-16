package com.leedcode.prac.test;

public class StringReverse {
	public static void main(String[] args) {
		char[] array = {'h','e','l','l','o'};
		char[] returnArr = reverseString(array);
		for (char c : returnArr) System.out.println("test"+c);
		
	}
	
	public static char[] reverseString(char[] str) {
        for (int i=0;i<str.length/2;i++) {
            char temp = str[i];
            str[i]=str[str.length-i-1];
            str[str.length-i-1]=temp;
        }
        return str;
    }

}
