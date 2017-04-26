package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		System.out.print("입력 : ");
		int a=new Scanner(System.in).nextInt();
		if(a>0&&a<101){
			if(a%2==0)
			{
				System.out.println("2의 배수입니다.");
			}
			else
				System.out.println("2의 배수가 아닙니다.");
		}
	}

}
