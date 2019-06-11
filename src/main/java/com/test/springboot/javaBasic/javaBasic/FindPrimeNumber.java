package com.test.springboot.javaBasic.javaBasic;

public class FindPrimeNumber {
	public static int primeNumbers(double num) {
		int count = 0;
		for (int i = 0; i < num; i++) {
			if (checkPrime(i)) count++;
		}
		return count;
	}

	public static boolean checkPrime(int i) {
		if (i <= 1) {
			return false;
		} else {
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(primeNumbers(10));
	}

}
