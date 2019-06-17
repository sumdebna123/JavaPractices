package com.test.springboot.javaBasic.javaBasic;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		System.out.println(checkPrime(129292929));
		
	}
	public static String checkPrime(long value) {
		if (value==0 || value==1 || value==2) return "prime";
		else {
			if (value %2==0) return "Not a prime";
			for (int i=2;i<value/2;i++) {
				if (value % i == 0) return "Not a prime";
			}
			return "prime";
		}
	}

}
