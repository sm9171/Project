package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ShowDate {

	public static void main(String[] args) {
		Calendar today = new GregorianCalendar();
		DateCalculator totalDay = new DateCalculator();
		//���ذ� ��������? �������? ��� Ȯ��
		System.out.println(totalDay.isLeapYear(today.YEAR) == true? "����" : "���");
		//1�� 1�� 1�Ϻ��� ���ñ����� �� ���� ��� ���
		long total = totalDay.getDays();
		System.out.println("�ѳ�¥�� : " + total);

	}

}
