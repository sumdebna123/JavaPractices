package com.amazon.interview;

public class StringToIntegerConvertion {
	
	public static void main(String[] args) {
		System.out.println(myAtoi("4193 with words"));
	}
	
	
	 public static int myAtoi(String str) {
			String s="";
				try {
					return Integer.parseInt(str);
				}catch (Exception e) {
					//get the first value : 
					char fCh =str.charAt(0);
					int value =fCh;
					if (value<47 && value>57) {
						return 0;
					} else {
						char[] charArray = str.toCharArray();
						for (char c: charArray) {
							int i = c;
							
							if (value>47 && value<57) {
								s=s+c;
								
							} else {
								return Integer.parseInt(s);
							}
						}
					}
				}
				return Integer.parseInt(s);
		}

}
