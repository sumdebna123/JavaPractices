//package com.test.springboot.javaBasic.javaBasic;
//
//import java.util.Arrays;
//
//public class RemoveOddNumber {
//	
//	 public static int[] noOdds(int[] nums) {
////		 int[] newArray = new int[nums.length];
////		 int count =0;
////	      for (int i=0;i<nums.length;i++) {
////	    	  
////	    	  if (nums[i]%2==0) {
////	    		  newArray[count]=nums[i];
////	    		  count++;
////	    	  }
////	      }
////	      newArray = Arrays.copyOf(newArray, newArray.length - count);
////	      return newArray;
//		 return Arrays.stream(nums).filter(n-> n%2==0).toArray();
//	    }
//	 
//	 public static void main(String[] args) {
//		 int[] myArr={2,3,4,5,6,7};
//		 int[] newArr=noOdds(myArr);
//		 for (int i:newArr)
//			 System.out.println(i);
//	}
//
//}
