package com.test.springboot.javaBasic.javaBasic;

import java.util.Arrays;

public class SortingList {
	
	public static void main(String[] args) {
		String s ="welcometojava";
		String[] strArray= new String[s.length()-2];
		
		for (int i=0;i<s.length()-2;i++) {
			System.out.println(s.substring(i,i+3));
			strArray[i]=s.substring(i,i+3);
		}
		Arrays.sort(strArray);
		
	
		
	}

}
