package com.test.springboot.javaBasic.javaBasic;

public class StringReverserWithSingleArray {
	public static void main(String[] args) {
		String str = "Sumitx";
		char[] newChar = new char[str.length()];
		for (int i=0;i<str.length();i++) {
			newChar[i]=str.charAt(i);
		}
		
		for (int k=0;k<str.length()/2;k++) {
			newChar[k]=str.charAt(str.length()-(k+1));
			newChar[str.length()-(k+1)]=str.charAt(k);
		}

		for (char c:newChar) {
			System.out.print(c);
		}
		
	}

}
