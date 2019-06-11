package com.leedcode.prac.test;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord obj1= new LengthOfLastWord();
		System.out.println(obj1.lengthOfLastWord("Hello World"));
		
	}
	
	public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        int len=str.length;
        String st=str[len-2];
        return st.length();
        
    }

}
