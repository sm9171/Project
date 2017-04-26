//미완성
package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String a[] = sc.nextLine().split(" ");
		
		double sum=0;
		if(a.length==5)
		{
			double q=Double.parseDouble(a[0]);
			double w=Double.parseDouble(a[1]);
			double e=Double.parseDouble(a[2]);
			double r=Double.parseDouble(a[3]);
			double t=Double.parseDouble(a[4]);
			sum=(((q+w)/2)*0.6)+(((e+r)/2)*0.2)+(t*0.2);
			System.out.println(sum);
			if(sum>=90)
				System.out.println("Gold Class");
			else if(sum>=80)
				System.out.println("Silver Class");
			else if(sum>=70)
				System.out.println("Bronze Class");
			else
				System.out.println("Normal Class");
		}
		else
		{
			System.out.println("다시입력하세요");
		}
		
		
		
	
		
	}
	
}
