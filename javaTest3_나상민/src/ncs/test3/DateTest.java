package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.*;


public class DateTest {

	public static void main(String[] args) {
		Calendar today=new GregorianCalendar();
		Calendar when=new GregorianCalendar(1991,06,01);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY'��' MM'��' dd'��'");
		String a="";
		switch(when.get(when.DAY_OF_WEEK)){
		case 1: a="�Ͽ���"; break;
		case 2: a="������"; break;
		case 3: a="ȭ����"; break;
		case 4: a="������"; break;
		case 5: a="�����"; break;
		case 6: a="�ݿ���"; break;
		case 7: a="�����"; break;
		}
		String fmT=sdf.format(today.getTime());
		String birth=sdf.format(when.getTime());		
		
		System.out.println("���� : "+birth +a);
		System.out.println("���� : " + fmT);
		System.out.println("���� : "+(today.get(Calendar.YEAR)-when.get(Calendar.YEAR)+1)+" ��");
		
	}

}
