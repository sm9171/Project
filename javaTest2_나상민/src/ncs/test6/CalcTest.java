package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc=new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int a=sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int b=sc.nextInt();
		System.out.println("��: "+calc.sum(a, b));
		System.out.println("��: "+calc.subtract(a, b));
		System.out.println("��: "+calc.multiply(a, b));
		System.out.println("������: "+calc.divide(a, b));
		

	}

}
