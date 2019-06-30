package com.test.springboot.javaBasic.javaBasic;

public class InsertionSort {
	public static void main(String[] args) {

        int[] intArray = { 1,6,-2,3,4,4,6,1,3};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length;firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
            	//System.out.println("The value of I :"+i);
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
        
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
