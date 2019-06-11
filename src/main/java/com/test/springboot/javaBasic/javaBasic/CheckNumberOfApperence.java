package com.test.springboot.javaBasic.javaBasic;

public class CheckNumberOfApperence {
	public static void main(String[] args) {
		int firstApper=0;
		int secondApper=0;
		firstApper=checkNumOfApp("This is not","is");
		secondApper=checkNumOfApp("This is not","not");
		if (firstApper==secondApper) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	public static int checkNumOfApp(String mainStr, String matchStr) {
		int counter=0;
		for (int i=0;i<mainStr.length()-matchStr.length();i++) {
			String compStr=new String(new char[]{mainStr.charAt(i),mainStr.charAt(i+1)});
			if (compStr.equalsIgnoreCase(matchStr)) {
				counter++;
			}
		}
		return counter;
	}
	

}
