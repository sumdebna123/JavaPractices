package com.test.springboot.javaBasic.javaBasic;

/*
 * 
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */

public class BirthdayCakeCandleProblem {

	public static void main(String[] args) {
		int[] input = {2,3,5,5,1};
		System.out.println(returnCandleCount(5,input));
	}
	
	public static int returnCandleCount(int arrayCount, int[] intArray) {
		int maxNumber =0;
		for (int i=0;i<arrayCount;i++) {
			if (i==0) maxNumber=intArray[i];
			if (maxNumber<intArray[i]) {
				maxNumber=intArray[i];
			}
		}
		
		//count the max number in array 
		int count =0;
		for (int i : intArray) {
			if (i==maxNumber) {
				count++;
			}
		}
		
		return count;
	}

}
