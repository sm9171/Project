package com.mvc.controller;

import java.util.Scanner;

import com.mvc.model.Calculate;
import com.mvc.model.PayTable;
import com.mvc.model.Salary;
import com.mvc.view.Output;

public class PayTableTest {

	public static void main(String[] args) {
		Salary[] pt = new Salary[3];
	
		pt[0] = new PayTable("�Ҽ���",750000,2,3);
		pt[1] = new PayTable("���ָ�",800000,1,4);
		pt[2] = new PayTable("���ȸ�",650000,6,2);
		
		System.out.print("�μ�Ƽ��(%)�Է� : ");
		PayTable.setIncentive(new Scanner(System.in).nextFloat());
		System.out.println("                                        **** �޿����� ****");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("�̸�      �⺻��    ������   ��������   �ð��ܱٹ�  �ð��ܼ��� ����  �μ�Ƽ��(%)  ������   �Ǽ��ɾ�");
		System.out.println("---------------------------------------------------------------------------------------------------");
		for(int i=0;i<pt.length;i++)
		{
			/*((PayTable)pt[i]).calc();
			((PayTable)pt[i]).out();*/
			((Calculate)pt[i]).calc();
			((Output)pt[i]).out();
		}
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("�ο��� :"+(PayTable.getCount())+"��");
		
	}

}
