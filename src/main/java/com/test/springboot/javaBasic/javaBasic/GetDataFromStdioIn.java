package com.test.springboot.javaBasic.javaBasic;

import java.util.Scanner;

public class GetDataFromStdioIn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int a = scan.nextInt();
		 System.out.println("The length of the array :"+a);
		 int[] arrayOfInt = new int[a];
		 for (int i=0;i<a;i++) {
			 arrayOfInt[i]=scan.nextInt();
		 }
		
		 for (int i=0;i<a;i++) {
			 System.out.println(arrayOfInt[i]);
		 }
	}

}
