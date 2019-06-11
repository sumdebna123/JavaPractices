package com.test.springboot.javaBasic.javaBasic;

public class ArrayShortingWithOneLoop {
	public static void main(String[] args) {
		int[] unshortedArray = {1,7,4};
		for (int i=1;i<unshortedArray.length;i++) {
			System.out.println("1:"+unshortedArray[i]); 
			System.out.println("2:"+unshortedArray[i-1]);
			if (unshortedArray[i]<unshortedArray[i-1]) { 
				unshortedArray[i]=unshortedArray[i]+unshortedArray[i-1]; 
				System.out.println("i:"+unshortedArray[i]);
												
				unshortedArray[i-1]=unshortedArray[i]-unshortedArray[i-1];
				System.out.println("i-1:"+unshortedArray[i-1]);
				unshortedArray[i]=unshortedArray[i]-unshortedArray[i-1];
				i=0;
			}
		}
		for (int i:unshortedArray)
			System.out.println(i);
	}

}
