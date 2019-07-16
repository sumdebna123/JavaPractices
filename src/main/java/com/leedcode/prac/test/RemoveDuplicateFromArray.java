package com.leedcode.prac.test;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateFromArray {
	static int[] inputArray = {3,1,4};
	public static void main(String[] args) {
		
		System.out.println(containsDuplicate(inputArray));
		
	}
	
	public static boolean containsDuplicate(int[] nums) {
		Integer[] myInt = Arrays.stream( nums ).boxed().toArray( Integer[]::new );
        if (nums.length>0) {
            HashSet<Integer> abc = new HashSet<>(Arrays.asList(myInt));
            System.out.println("Num :"+nums.length);
            System.out.println("hashSet.size() :"+abc.size());
            System.out.println("HashSet: " + abc); 

            if (nums.length!=abc.size()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
        
    }

}
