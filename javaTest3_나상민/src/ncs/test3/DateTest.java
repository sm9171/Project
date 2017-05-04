package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.*;


public class DateTest {

	public static void main(String[] args) {
		Calendar today=new GregorianCalendar();
		Calendar when=new GregorianCalendar(1991,06,01);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY'년' MM'월' dd'일'");
		String a="";
		switch(when.get(when.DAY_OF_WEEK)){
		case 1: a="일요일"; break;
		case 2: a="월요일"; break;
		case 3: a="화요일"; break;
		case 4: a="수요일"; break;
		case 5: a="목요일"; break;
		case 6: a="금요일"; break;
		case 7: a="토요일"; break;
		}
		String fmT=sdf.format(today.getTime());
		String birth=sdf.format(when.getTime());		
		
		System.out.println("생일 : "+birth +a);
		System.out.println("현재 : " + fmT);
		System.out.println("나이 : "+(today.get(Calendar.YEAR)-when.get(Calendar.YEAR)+1)+" 세");
		
	}

}
