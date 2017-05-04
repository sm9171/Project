package com.week4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestWork1 {
	static Calendar today = new GregorianCalendar();
	public static void main(String[] args) {
		 int currentYear = today.get(Calendar.YEAR);
		 int currentMonth = today.get(Calendar.MONTH)+1;
		 int currentDay = today.get(Calendar.DATE);
		 int currentHour = today.get(Calendar.HOUR);
		 int currentMinute = today.get(Calendar.MINUTE);
		 int currentSeconds = today.get(Calendar.SECOND);
		 System.out.println(currentYear+"년 " + currentMonth+"월 " +currentDay+"일 "+currentHour+"시 "+currentMinute+"분 "+currentSeconds+"초");
	}

}
