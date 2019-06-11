package com.test.springboot.javaBasic.javaBasic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDayOfTheWeek {
	public static void main(String[] args) throws ParseException {
		System.out.println(findDay(8,5,2017));
		
	}
	
	public static String findDay(int month, int day, int year)  {
		String dateStr= day+"/"+month+"/"+year;
		System.out.println(dateStr);
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		} catch (Exception e) {
			return e.getMessage();
		}
		
		SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return simpleDateformat.format(date).toUpperCase();

    }

}
