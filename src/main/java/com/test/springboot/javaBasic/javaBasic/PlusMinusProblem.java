package com.test.springboot.javaBasic.javaBasic;

/*
 * 
 * 
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */

public class PlusMinusProblem {

	public static void plusMinus(int[] arr) {
		int negNumber=0;
		int posNumber =0;
		int zeroNumber =0;
		int count =0;
		
		
		for (int i:arr) {
			if (i>0) {
				posNumber++;
			} else if (i==0){
				zeroNumber++;
			} else {
				negNumber++;
			}
			count++;
		}
		
		System.out.println(posNumber);
		System.out.println(negNumber);
		System.out.println(zeroNumber);
		System.out.println(count);

		float x=(float)posNumber/count;
		float y=(float)negNumber/count;
		float z=(float)zeroNumber/count;
		float k = (float) 2.30393;
		System.out.println("the value is :"+x);
		System.out.println("the value is :"+y);
		System.out.println("the value is :"+k);
		

	}

	public static void main(String[] args) {
		int[] input={2,-3,4,0,2};
		plusMinus(input);
		

	}

}
