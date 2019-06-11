package com.test.springboot.javaBasic.javaBasic;

public class GetDivide {
	public int divide(int dividend, int divisor) {
		if (dividend==-2147483648 && divisor==-1 ) {
			return (int) ((double)dividend/divisor);
		} 
		return dividend / divisor;
	}
	
	
	
	public static void main(String[] args) {
		GetDivide obj = new GetDivide();
		System.out.println(obj.divide(-2147483648, -1));
	}

}
