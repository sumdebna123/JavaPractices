package com.test.springboot.javaBasic.javaBasic;

public class ValRev {
	public static int[] additiveInverse(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			if (i>0) arr[i]=-arr[i];
			else arr[i]=-arr[i];
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {5, -7, 8, 3};
		additiveInverse(arr);
		for(int i:arr)
		System.out.println(i);
	}

}
