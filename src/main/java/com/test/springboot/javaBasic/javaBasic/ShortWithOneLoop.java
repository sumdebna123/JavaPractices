package com.test.springboot.javaBasic.javaBasic;

public class ShortWithOneLoop {
	public static void main(String[] args) {
		int[] myArray = {3,5,1,8,2};
		int temp=0;
		for (int i=0;i<myArray.length-1;i++) {
			if (myArray[i]>myArray[i+1]) {
				
				temp=myArray[i+1];
				myArray[i+1]=myArray[i];
				myArray[i]=temp;
			}
		}
		for (int i:myArray)
			System.out.println(i);
	}

}
