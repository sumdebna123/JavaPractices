package com.test.springboot.javaBasic.javaBasic;

import java.util.Arrays;

public class FilterArray {
	public static String[] filterArray(String[] str) {
		String[] strArr=new String[str.length];
		int counter=0;
		for (String s : str) {
			try {
				int i = Integer.parseInt(s);
				strArr[counter]=String.valueOf(i);
				counter++;
			}catch(Exception e) {
				
			}
		}
		strArr=Arrays.copyOf(strArr, counter);
		return strArr;

	}
	
	public static void main(String[] args) {
		String[] input = {"1", "2", "3", "4", "5", "6", "7", "8"};
		String[] result =filterArray(input);
		
		for (String s : result) {
			System.out.println(s);
		}
	}

}
