package com.week4;

import java.util.Scanner;

public class ExamTest {
	static ExamString es=new ExamString();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �Է� : ");
		System.out.println(es.preChar(sc.next()));
		System.out.print("���ڿ� �Է� : ");
		String a=sc.next();
		System.out.print("���� �Է� : ");
		char b=sc.next().charAt(0);
		int c =es.charSu(a, b);
		System.out.println(b+"�� "+c+"�� ���ԵǾ��ֽ��ϴ�.");
	}

}
