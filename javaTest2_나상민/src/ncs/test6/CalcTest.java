package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc=new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int a=sc.nextInt();
		System.out.print("두번째 정수 : ");
		int b=sc.nextInt();
		System.out.println("합: "+calc.sum(a, b));
		System.out.println("차: "+calc.subtract(a, b));
		System.out.println("곱: "+calc.multiply(a, b));
		System.out.println("나누기: "+calc.divide(a, b));
		

	}

}
