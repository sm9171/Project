package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.print("�Է� : ");
		int a=new Scanner(System.in).nextInt();
		if(a>0&&a<101){
			if(a%2==0)
			{
				System.out.println("2�� ����Դϴ�.");
			}
			else
				System.out.println("2�� ����� �ƴմϴ�.");
		}
	}

}
