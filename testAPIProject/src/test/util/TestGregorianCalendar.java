package test.util;

import java.text.*;
import java.util.*;

public class TestGregorianCalendar {

	public static void main(String[] args) {
		// GregorianCalendar Ŭ���� �׽�Ʈ
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
		System.out.println("newYork : "+year + "�� " + month + "�� "+ date + "�� " + hour+"�� "+minute+"�� "+second+"��");
	
		DateFormat fmt = new SimpleDateFormat("yyyy'��' MM'��' dd'�� 'hh'��' mm'��' ss'��'");
		String fmtToday = fmt.format(today.getTime());
		System.out.println(fmtToday);
		System.out.printf("%tY�� %tm�� %td�� %tH�� %tM�� %tS��",today,today,today,today,today,today);
	}

}
