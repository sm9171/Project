package com.calc;

public class Calculator {

	public static void main(String[] args) {
		
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		System.out.printf("합 : %d\n",a+b);
		System.out.printf("차 : %d\n",a-b);
		System.out.printf("곱 : %d\n",a*b);
		System.out.printf("나누기 : %d\n",a/b);
		
	}

}
