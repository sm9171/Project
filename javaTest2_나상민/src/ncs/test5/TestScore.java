package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a[][]=new double[3][5];
		for(int i=0;i<a.length;i++)
		{
			for(int j =0; j<a[i].length-2;j++)
			{
				System.out.print((i+1)+"번 학생의 과목"+(j+1)+" 점수 :");
				a[i][j]=sc.nextDouble();
			}
		}
		for(int i=0;i<a.length;i++)
		{
				a[i][3]+=a[i][0]+a[i][1]+a[i][2];
				a[i][4]=(a[i][0]+a[i][1]+a[i][2])/(a[i].length-2);
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j =0; j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
