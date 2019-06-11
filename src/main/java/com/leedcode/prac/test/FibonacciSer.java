package com.leedcode.prac.test;

public class FibonacciSer {
	public static void main(String[] args) {
//		System.out.println(Fibonacci(12));
		int num=10;
		if (num%100==0) System.out.println("test");
		else System.out.println("test1");
	}
	
	public static int Fibonacci(int a) {
		int n1=1,n2=2,n3 = 0;
		for (int i=2;i<a;++i) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}

}
