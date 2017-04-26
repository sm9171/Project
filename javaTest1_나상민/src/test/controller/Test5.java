package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		System.out.print("첫번 째 정수입력 : ");
		int a=new Scanner(System.in).nextInt();
		System.out.print("두번 째 정수입력 : ");
		int b=new Scanner(System.in).nextInt();
		if(a>=1&&a<=9&&b>=1&&b<=9){
			if(a*b>=10&&a*b<=99)
			{
				System.out.println("두자리 수 입니다.");
			}
			else if(a*b<10)
			{
				System.out.println("한자리 수 입니다.");
			}
		}
	}

}
