package com.test.springboot.javaBasic.javaBasic;

public class SelectionSort {
	public static void main(String[] args) {
		int[] intArray = {2,4,1};
		int leargest=0;
		for (int sortedBoundaryLimit = intArray.length-1;sortedBoundaryLimit>0;sortedBoundaryLimit--) {
			for (int i = 0;i<sortedBoundaryLimit;i++) {
				if (intArray[i]>intArray[i+1]) {
					leargest = i;
				}
				
				System.out.println("leargest"+leargest);
				
				swap(intArray, leargest, sortedBoundaryLimit);
			}
		}
		
		for (int i: intArray) {
			System.out.println("the value :"+i);
		}
	}
	
	public static void swap(int[] array, int i, int j) {
		
		for (int a : array) System.out.println("in value :"+a);
		
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
