package com.test.springboot.javaBasic.javaBasic;

public class BubbleSort {
	public static void main(String[] args) {
		int[] myArray = {2,-3,4,1,-7};
		int temp;
		
		for ( int unsortedBoundary= myArray.length-1;unsortedBoundary>0;unsortedBoundary--) {
			for (int i=0;i<unsortedBoundary;i++) {
				if (myArray[i]>myArray[i+1]) {
					temp = myArray[i+1];
					myArray[i+1]=myArray[i];
					myArray[i]=temp;
				}
			}
		}
		
		for (int i: myArray) {
			System.out.println("the value :"+i);
		}
		
	}

}
