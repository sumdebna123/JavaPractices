package com.test.springboot.javaBasic.javaBasic;

public class SortingTest {
	public static void main(String[] args) {
		int[] intArray = {3,2,4,9,8,7};
		int[] sortArray = new int[6];
		int counter;
		for (int i=0;i<intArray.length;i++) {
			counter=0;
			for (int j=0;j<intArray.length;j++) {
				if (intArray[i]>intArray[j]) {
					counter++;
				}
			}
			sortArray[counter]=intArray[i];
		}
		System.out.println("sortArray :"+sortArray);
		for (int i:sortArray) {
			System.out.println(i); 
		}
		
	}

}
