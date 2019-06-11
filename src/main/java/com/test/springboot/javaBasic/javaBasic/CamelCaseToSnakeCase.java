package com.test.springboot.javaBasic.javaBasic;

public class CamelCaseToSnakeCase {
	public static String toCamelCase(String str) {
		System.out.println(str);
		int index=str.indexOf("-");
		System.out.println("Index ;"+index);
		String partOne = str.substring(0,index);
		System.out.println(partOne);
		String partTwo = str.substring(index,index+1).toUpperCase();
		String partThree = str.substring(index+1,str.length()-1);
		return partOne+partTwo+partThree;
	}
	
	public static void main(String[] args) {
		System.out.println(toCamelCase("sumit_debnath"));
	}

}
