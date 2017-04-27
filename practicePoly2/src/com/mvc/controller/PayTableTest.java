package com.mvc.controller;

import java.util.Scanner;

import com.mvc.model.Calculate;
import com.mvc.model.PayTable;
import com.mvc.model.Salary;
import com.mvc.view.Output;

public class PayTableTest {

	public static void main(String[] args) {
		Salary[] pt = new Salary[3];
	
		pt[0] = new PayTable("소서노",750000,2,3);
		pt[1] = new PayTable("고주몽",800000,1,4);
		pt[2] = new PayTable("모팔모",650000,6,2);
		
		System.out.print("인센티브(%)입력 : ");
		PayTable.setIncentive(new Scanner(System.in).nextFloat());
		System.out.println("                                        **** 급여명세서 ****");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("이름      기본급    가족수   가족수당   시간외근무  시간외수당 세금  인센티브(%)  성과금   실수령액");
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(int i=0;i<pt.length;i++)
		{
			/*((PayTable)pt[i]).calc();
			((PayTable)pt[i]).out();*/
			((Calculate)pt[i]).calc();
			((Output)pt[i]).out();
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("인원수 :"+(PayTable.getCount())+"명");
		
	}

}
