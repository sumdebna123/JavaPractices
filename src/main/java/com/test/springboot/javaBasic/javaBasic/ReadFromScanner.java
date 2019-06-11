package com.test.springboot.javaBasic.javaBasic;

import java.util.Scanner;

public class ReadFromScanner {
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		int a= Integer.parseInt(myScan.next());
		int b = Integer.parseInt(myScan.nextLine());
		int c = Integer.parseInt(myScan.nextLine());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		myScan.close();

	}

}
