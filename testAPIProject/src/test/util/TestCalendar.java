package test.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestCalendar {

	public static void main(String[] args) {
		// java.util.Calendar 클래스 테스트
		Calendar today = Calendar.getInstance();
		System.out.println("today : " + today);
		System.out.println(today.get(Calendar.YEAR) + "년");
		System.out.println((today.get(Calendar.MONTH) + 1) + "월");
		System.out.println(today.get(Calendar.DATE) + "일");
		System.out.println(today.get(Calendar.HOUR) + "시");
		System.out.println(today.get(Calendar.MINUTE) + "분");
		System.out.println(today.get(Calendar.SECOND) + "초");

		Calendar when = Calendar.getInstance();
		when.set(2017, 11, 25);
		int dayOfWeek = when.get(Calendar.DAY_OF_WEEK);
		System.out.println("dayofweek : " + dayOfWeek);

		String weekName = null;

		switch (dayOfWeek) {
		case 1:
			weekName = " 일";
			break;
		case 2:
			weekName = " 월";
			break;
		case 3:
			weekName = " 화";
			break;
		case 4:
			weekName = " 수";
			break;
		case 5:
			weekName = "목";
			break;
		case 6:
			weekName = " 금";
			break;
		case 7:
			weekName = " 토";
			break;

		}
		System.out.println("2017.12.25 일의 요일은"+weekName+"요일이다.");
		Calendar currentNewYork=Calendar.getInstance(TimeZone.getTimeZone("America/NewYork"));
		System.out.println("뉴욕의 현재 시간 : "+currentNewYork);
		Date newYorkTime = currentNewYork.getTime();
		System.out.println("뉴욕은 " + newYorkTime);
		
	}

}
