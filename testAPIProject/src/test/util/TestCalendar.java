package test.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestCalendar {

	public static void main(String[] args) {
		// java.util.Calendar Ŭ���� �׽�Ʈ
		Calendar today = Calendar.getInstance();
		System.out.println("today : " + today);
		System.out.println(today.get(Calendar.YEAR) + "��");
		System.out.println((today.get(Calendar.MONTH) + 1) + "��");
		System.out.println(today.get(Calendar.DATE) + "��");
		System.out.println(today.get(Calendar.HOUR) + "��");
		System.out.println(today.get(Calendar.MINUTE) + "��");
		System.out.println(today.get(Calendar.SECOND) + "��");

		Calendar when = Calendar.getInstance();
		when.set(2017, 11, 25);
		int dayOfWeek = when.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayofweek : " + dayOfWeek);

		String weekName = null;

		switch (dayOfWeek) {
		case 1:
			weekName = " ��";
			break;
		case 2:
			weekName = " ��";
			break;
		case 3:
			weekName = " ȭ";
			break;
		case 4:
			weekName = " ��";
			break;
		case 5:
			weekName = "��";
			break;
		case 6:
			weekName = " ��";
			break;
		case 7:
			weekName = " ��";
			break;

		}
		System.out.println("2017.12.25 ���� ������"+weekName+"�����̴�.");
		Calendar currentNewYork=Calendar.getInstance(TimeZone.getTimeZone("America/NewYork"));
		System.out.println("������ ���� �ð� : "+currentNewYork);
		Date newYorkTime = currentNewYork.getTime();
		System.out.println("������ " + newYorkTime);
		
	}

}
