package com.test.springboot.javaBasic.javaBasic;

public class FindTheIndex {
	public static int findIndex(String[] arr, String str) {
		for (int i=0;i<arr.length;i++){
			if (str.equals(arr[i])) return i;
		}
		return 0;

	}
	public static void main(String[] args) {
		
	}

}
