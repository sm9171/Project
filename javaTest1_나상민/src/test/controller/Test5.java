package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		System.out.print("ù�� ° �����Է� : ");
		int a=new Scanner(System.in).nextInt();
		System.out.print("�ι� ° �����Է� : ");
		int b=new Scanner(System.in).nextInt();
		if(a>=1&&a<=9&&b>=1&&b<=9){
			if(a*b>=10&&a*b<=99)
			{
				System.out.println("���ڸ� �� �Դϴ�.");
			}
			else if(a*b<10)
			{
				System.out.println("���ڸ� �� �Դϴ�.");
			}
		}
	}

}
