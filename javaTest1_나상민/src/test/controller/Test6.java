package test.controller;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		System.out.print("���� �Է� : ");
		int a= new Scanner(System.in).nextInt();
		switch(a){
		case 1:
			System.out.println("** �Է��� ���������� �Ǿ����ϴ�! **");break;
		case 2:
			System.out.println("** ��ȸ�� ���۵Ǿ����ϴ�! **");break;
		case 3:
			System.out.println("** ������ ���������� �Ǿ����ϴ�! ** ");break;
		case 4:
			System.out.println("** ������ ���������� �Ǿ����ϴ�! ** ");break;
		case 5:
			System.out.println("** ���������� ���� �Ǿ����ϴ�! **");break;
		default:
			System.out.println("** �ٽ� �Է��� �ּ���! **");	
		}
	}

}
