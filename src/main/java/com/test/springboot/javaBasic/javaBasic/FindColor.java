package com.test.springboot.javaBasic.javaBasic;

public class FindColor {
	public static void main(String[] args) {
		System.out.println(getColor("rxxred"));
		
	}
	
	public static String getColor(String str) {
		String returnVal="";
		if (str.length()>2) {
			for (int i=0;i<str.length();i++) {
				if (str.charAt(i)=='r' && str.substring(i).length()>=3) {
				
					String val1=str.substring(i, (i+3));
					if (val1.equals("red")) {
						returnVal= str.substring(i, (i+3));
					} 
				}
				
				if (str.charAt(i)=='b' && str.substring(i).length()>=4) {
					
					String val2=str.substring(i, (i+4));

					if (val2.equals("blue")) {
						returnVal= str.substring(i, (i+4));
					} 
				}
			}
		} 
		return returnVal;
		
	}

}


