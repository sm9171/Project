package test.util;

import java.text.*;
import java.util.*;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// GregorianCalendar 클래스 테스트
		Calendar today = new GregorianCalendar();
		Calendar when = new GregorianCalendar(2017, 11, 25);
		Calendar newYork = new GregorianCalendar(TimeZone.getTimeZone("America/NewYork"));

		System.out.println("today : " + today.getTime());
		System.out.println("when : " + when.getTime());
		System.out.println("newyork : " + newYork.getTime());
		
		int year = newYork.get(Calendar.YEAR);
		int month = newYork.get(Calendar.MONTH)+1;
		int date = newYork.get(Calendar.DATE);
		int hour = newYork.get(Calendar.HOUR);
		int minute = newYork.get(Calendar.MINUTE);
		int second = newYork.get(Calendar.SECOND);
		System.out.println("newYork : "+year + "년 " + month + "월 "+ date + "일 " + hour+"시 "+minute+"분 "+second+"초");
	
		DateFormat fmt = new SimpleDateFormat("yyyy'년' MM'월' dd'일 'hh'시' mm'분' ss'초'");
		String fmtToday = fmt.format(today.getTime());
		System.out.println(fmtToday);
		System.out.printf("%tY년 %tm월 %td일 %tH시 %tM분 %tS초",today,today,today,today,today,today);
	}

}
