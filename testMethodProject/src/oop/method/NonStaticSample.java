package oop.method;

import java.util.Random;

public class NonStaticSample {

	public int[] intArrayAllocation(int a) {
		Random r = new Random();
		int b[] = new int[a];
		for (int i = 0; i < b.length; i++) {
			b[i] = (r.nextInt(100) + 1);
		}
		return b;
	}

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.println(a[i]);
	}

	public void swap(int a[], int begin, int end) {
		int flag = 0;
		System.out.println("첫번째 정수 : " + a[begin]);
		System.out.println("두번째 정수 : " + a[end]);
		flag = a[end];
		a[end] = a[begin];
		a[begin] = flag;
		System.out.println("첫번째 정수 : " + a[begin]);
		System.out.println("두번째 정수 : " + a[end]);

	}

	public void sortDescending(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] < a[j]) {
					swap(a,i,j);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public void sortAscending(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					swap(a,i,j);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}
	public int countChar(String a,char b){
		int count =0;
		for(int i =0;i<a.length();i++){
			if(a.charAt(i)==b)
			{
				count++;
			}
		}
		if(count==0){
			return 0;
		}
		return count;
	}
	public int totalValue(int a,int b){
		int count=0;
		if(a>b)
		{
			for(int i=b;i<=a;i++)
			{
				count+=i;
			}
		}
		else if(a<b)
		{
			for(int i=a;i<=b;i++)
			{
				count+=i;
			}
		}
		return count;	
	}
	public char pCharAt(String a,int b){
		
		char c=a.charAt(b-1);
		return c;
	}
	public String pConcat(String a,String b){
		String c=a+b;
		return c;
	}
}
