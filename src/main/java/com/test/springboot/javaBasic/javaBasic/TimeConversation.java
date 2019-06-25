package com.test.springboot.javaBasic.javaBasic;

/*
 * https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen
 */
public class TimeConversation {

	public static void main(String[] args) {
		System.out.println(timeConversion("12:45:54AM"));

	}
	static String timeConversion(String s) {
		String[] timeArray = s.split(":");
		
		
		String getAMPM= s.substring(s.length()-2, s.length());
		int newHrVal =0;
		
		if (getAMPM.equalsIgnoreCase("PM")) {
			if (timeArray[0].equalsIgnoreCase("12")) {
				timeArray[0]="12";
			} else {
				newHrVal=Integer.parseInt(timeArray[0])+12;
				if (newHrVal==24) {
					timeArray[0]="00";
				} else {
					timeArray[0]=Integer.toString(newHrVal);
				}
			}
		} else {
			if (timeArray[0].equalsIgnoreCase("12")) {
				timeArray[0]="00";
			}
		}
		return timeArray[0]+":"+timeArray[1]+":"+timeArray[2].substring(0, timeArray[2].length()-2);
       

    }

}
