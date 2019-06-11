package com.test.springboot.javaBasic.javaBasic;

public class ArrayMarge {
	public static void main(String[] args) {
		int[] firstArr= {2,3,5,7,9};
		int[] secondArr = {1,4,8,10};
		int[] margeArray=new int[firstArr.length+secondArr.length];
		int counter =0;
		
		for (int i=0;i<firstArr.length;i++) {
			margeArray[counter]=firstArr[i];
			counter++;
		}
		
		for (int i=0;i<secondArr.length;i++) {
			margeArray[counter]=secondArr[i];
			counter++;
		}
		
		for (int i :margeArray)
			System.out.println(i);
		
		System.out.println("--------");
		
		for (int i=1;i<margeArray.length;i++) {
			System.out.println("1:"+margeArray[i]);
			System.out.println("2:"+margeArray[i-1]);
			if (margeArray[i]<margeArray[i-1]) {
				margeArray[i]=margeArray[i]+margeArray[i-1];
				System.out.println("3:"+margeArray[i]);
				
				margeArray[i-1]=margeArray[i]-margeArray[i-1];
				System.out.println("3:"+margeArray[i-1]);
				margeArray[i]=margeArray[i]-margeArray[i-1];
				i=0;
			}
		}
		
		for (int i :margeArray)
			System.out.println(i);
		 
	}

}
