package com.test.springboot.javaBasic.javaBasic;

/*
 * 
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */

public class AppleOrangeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Complete the countApplesAndOranges function below.
	public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	int noOfApple =0;
    	int noOfOrrange = 0;
    	for (int c=0;c<apples.length;c++) {
    		if ((a+apples[c])>=s && (a+apples[c])<=t)
    			noOfApple++;
    	}
    	
    	for (int c=0;c<oranges.length;c++) {
    		if ((b+oranges[c])>=s && (b+oranges[c])<=t)
    			noOfOrrange++;
    	} 
    	
    	System.out.println(noOfApple);
    	System.out.println(noOfOrrange);


    }

}
