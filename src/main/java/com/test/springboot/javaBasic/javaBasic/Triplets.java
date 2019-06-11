package com.test.springboot.javaBasic.javaBasic;

public class Triplets {
	public static void main(String[] args) {
		int[] firstArray= {8,6,4,5,6};
		int [] secondArray= {3,4,5,6,7};
		int firstArrayPtn =0;
		int secondArrayPtn =0;
		int[] returnArray=new int[2];
		
		for (int i=0; i<firstArray.length;i++) {
			if (firstArray[i]>secondArray[i]) {
				firstArrayPtn++;
			} else if (firstArray[i]<secondArray[i]) {
				secondArrayPtn++;
			}
		}
		returnArray[0]=firstArrayPtn;
		returnArray[1]=secondArrayPtn;
		
		System.out.println(returnArray[0]+" "+returnArray[1]);
		
	}

}
