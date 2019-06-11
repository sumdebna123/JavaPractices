package com.test.springboot.javaBasic.javaBasic;

/*
 * Array Shift 
 * 
 * 
 */

public class LeftRotation {
	public static void main(String[] args) {
		int[] inputArray = {1,2,3,4,5,6};
		
		int[] result = arrayShift(inputArray, 2);
		for (int i: result) {
			System.out.println(i);
		}
		
	}
	
	public static int[] arrayShift(int[] intArry, int shiftVal) {
		int arrayLength = intArry.length;
		//find the largest value of the array x`
		int largestVal =0;
		for (int i=0;i<arrayLength;i++) {
			if (i==0) largestVal=intArry[i];
			if (largestVal<intArry[i]) largestVal=intArry[i];
		}
		System.out.println("the largest value :"+largestVal);
		
		
		for (int i= 0;i<arrayLength;i++) {
			if (intArry[i]+shiftVal>largestVal) {
				intArry[i]=(intArry[i]+shiftVal)-largestVal;
			} else {
				intArry[i]=intArry[i]+shiftVal;
			}
		}
		return intArry;
	}

}
