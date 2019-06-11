package com.test.springboot.javaBasic.javaBasic;

public class CountYZ {
	public static void main(String[] args) {
		String str="day:yak";
		int counter=0;
		String[] strArray=str.split("[^a-zA-Z]+");
		
		for (String st: strArray) {
			if (st.charAt(st.length()-1)=='y' || st.charAt(st.length()-1)=='z') {
				counter++;
			}
			if (st.endsWith("y") || st.endsWith("z")) {
				counter++;
			}
		}
	}
}
