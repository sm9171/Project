package com.calc;

public class Calculator {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.printf("�� : %d\n",a+b);
		System.out.printf("�� : %d\n",a-b);
		System.out.printf("�� : %d\n",a*b);
		System.out.printf("������ : %d\n",a/b);
		
	}

}
