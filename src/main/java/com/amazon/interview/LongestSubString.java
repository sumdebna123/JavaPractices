package com.amazon.interview;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("bbbbb"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		
		char[] charArray = s.toCharArray();
		List<Character> lst = new ArrayList<>();
		for (int i=0;i<charArray.length;i++) {
			if(lst.size()==0){
				lst.add(charArray[i]);
			} else if (!lst.contains(charArray[i])) {
				lst.add(charArray[i]);
			} else {
				return i;
			}
			
		}
		return 0;
	}

}
