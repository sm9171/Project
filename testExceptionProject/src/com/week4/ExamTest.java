package com.week4;

import java.util.Scanner;

public class ExamTest {
	static ExamString es=new ExamString();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력 : ");
		System.out.println(es.preChar(sc.next()));
		System.out.print("문자열 입력 : ");
		String a=sc.next();
		System.out.print("문자 입력 : ");
		char b=sc.next().charAt(0);
		int c =es.charSu(a, b);
		System.out.println(b+"가 "+c+"개 포함되어있습니다.");
	}

}
