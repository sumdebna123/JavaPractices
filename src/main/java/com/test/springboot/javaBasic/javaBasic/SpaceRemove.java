package com.test.springboot.javaBasic.javaBasic;

import java.util.Arrays;

public class SpaceRemove {
	public static void main(String[] args) {
		String test = "s h y x";
		char[] myArray = test.toCharArray();
		int count = 0;
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("T " + i + " :" + myArray[i]);
			if (i < (myArray.length - 2)) {
				if (myArray[i] == ' ' || ((i > 0) && myArray[i - 1] == myArray[i])) {
					myArray[i] = myArray[i + 1];
					System.out.println("T new" + myArray[i]);
					
				}
			}
			if (myArray[i] == ' ' ) count++;
		}

		myArray = Arrays.copyOf(myArray, myArray.length - count);
		System.out.println("length :" + myArray.length);

		for (char c : myArray) {
			System.out.print(c);
		}
	}

}
