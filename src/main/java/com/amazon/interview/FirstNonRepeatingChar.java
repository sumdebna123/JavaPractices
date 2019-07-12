package com.amazon.interview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		System.out.println(nonRepeatingChar("leetcode"));
	}
	
	public static int nonRepeatingChar(String s) {
		char[] arr = s.toCharArray();
		SortedSet<Character> lst = new TreeSet<>();
		Map<Integer,Character> mp = new HashMap<>();
		
		
		
		for (int i=0;i<arr.length;i++) {
			lst.add(arr[i]);
			mp.put(i, arr[i]);
		}
		
		System.out.println(lst.size());
		
		lst.forEach(System.out::println);
		
//		while (lst.iterator().hasNext()) {
//			System.out.println(lst.iterator().next());
//		}
//		
		
		if (lst.size()==0) {
			return -1;
		} else {
			for (Entry<Integer, Character> entry : mp.entrySet()) {
				if (entry.getValue().equals(lst.iterator().next())) {
					return entry.getKey();
				}
			}
		}
		return -1;
		
	}

}
