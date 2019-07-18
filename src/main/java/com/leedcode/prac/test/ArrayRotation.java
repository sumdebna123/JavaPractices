package com.leedcode.prac.test;
/* The Array rotation method , takes an integer array and rotate upto the the k time 
 * public int[] arrayRotate(int[] input, int k) 
 * if the array is : [1,2,3,4,5] and k = 3
 * the result will be : [5,1,2,3,4]->[4,5,1,2,3]-> [3,4,5,1,2]
 * 
 * 
 */

public class ArrayRotation {
	public static void main(String[] args) {
		int[] input = {1,2,3,4,5,10,20,1,23,29,22,45,90};
		int k=7;
		int[] temp = input;
		for (int i=0;i<k;i++) {
			temp=arrayRotation(temp);
		}
		
		for (int i : temp) {
			System.out.println("The I value :"+i);
		}
		
	}
	
	public static int[] arrayRotation(int[] input) {
		int[] tempArray = new int[input.length];
		for (int i=0;i<input.length-1;i++) {
			tempArray[i+1]=input[i];
		}
		tempArray[0]=input[input.length-1];
		return tempArray;
		
	}
	
	
	
	
	

}
