package com.test.springboot.javaBasic.javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FiboGetTheEvenSum {
	public static void main(String[] args) {
		int i = 37;
		List<Integer> fiboList = new ArrayList<>();
		fiboList.add(0);
		fiboList.add(1);
		fiboList.add(1);
		int fValue = 1;
		int sValue = 1;
		int returnValue =0;

		while (i>returnValue) {
			
			returnValue=fibo(fValue,sValue);
			fValue=sValue;
			sValue=returnValue;
			fiboList.add(sValue);
			
		}
		int sum =0;
		for (int x=3;x<fiboList.size();x+=2) {
			sum=fiboList.get(x)+sum;
			System.out.println(fiboList.get(x));

		}
			
		System.out.println(sum);
		
		
		
	}
	public static int fibo(int a, int b) { return a+b;};

}
