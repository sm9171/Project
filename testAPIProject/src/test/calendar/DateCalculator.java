package test.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateCalculator {
	Calendar today = new GregorianCalendar();
	 public long getDays(){
		 long sumDays = 0L;
		 int currentYear = today.get(Calendar.YEAR);
		 int currentMonth = today.get(Calendar.MONTH)+1;
		 int currentDay = today.get(Calendar.DAY_OF_MONTH);
		 for(int y=1;y<today.get(Calendar.YEAR);y++)
		 {
			 if(this.isLeapYear(y))
			 {
				 sumDays+=366;
				
			 }
			 else{
				 sumDays+=365;
			 }
		 }
		for(int m = 1; m<currentMonth;m++)
			{
				if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
					sumDays +=31;
				if(m==4||m==6||m==9||m==11)
					sumDays +=30;
				if(m==2){
					if(this.isLeapYear(currentYear))
						sumDays+=29;
					else
						sumDays+=28;
				}
			}
		 
		 sumDays+=currentDay;
		 return sumDays;
		 
	 }
	/*	=> for loop ��� : 1�� 1�� 1�Ϻ��� ���ñ����� �ѳ��� �����
			- 1����� ���� �⵵���� �� �⵵�� �����̸� 366����,
			  ����̸� 365���� ���� ����
			- �ش� ���� �⵵�� �����̸� 2���� 29�Ϸ�, �ƴϸ� 28�Ϸ� ����
			- ���� ��¥�� ���� ����
			  31���� ��(ū��) : 1, 3, 5, 7, 8, 10, 12��
			  30���� ��(������) : 4, 6, 9, 11�� */
	public boolean isLeapYear(int year)
	{
		if((year%4==0)&&(year%100!=0||year%400==0))
				return true;
		else
				return false;
	}
	
	
	
	
	
}
