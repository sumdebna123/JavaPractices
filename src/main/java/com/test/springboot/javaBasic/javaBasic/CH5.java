package com.test.springboot.javaBasic.javaBasic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CH5 {

	// Complete the sockMerchant function below.
	static int sockMerchant(int n, int[] ar) {

		int pair = 0;
		for (int i = 0; i < n; i++) {
			List<Integer> myList = new ArrayList<Integer>();
			int count = 1;
			if (!myList.contains(ar[i])) {
				for (int j = i + 1; j < n; j++) {
					if (ar[i] == ar[j]) {
						count++;
					}
					
				}
				myList.add(ar[i]);
			}
			System.out.println("count :" + count);
			pair = pair + (count / 2);
			System.out.println("count :" + count);

		}
		return pair;

	}

	// private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int[] arr = { 10, 20, 20, 10, 10, 30, 50, 10, 20 };
		System.out.println(sockMerchant(9, arr));
	}
}
