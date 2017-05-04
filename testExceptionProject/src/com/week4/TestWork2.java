package com.week4;

public class TestWork2 {

	public static void main(String[] args) {
		int count=0;
		String c;
		String a ="J a v a P r o g r a m";
		System.out.println(a);
		System.out.println(a.length());
		String[] arr=a.split(" ",a.length());
		char[] b=new char [arr.length];
		for(int i=0;i<arr.length;i++){
			b[i]=arr[i].charAt(0);
			System.out.print(b[i]);
			count++;
		}
		System.out.println();
		System.out.println("±ÛÀÚ°¹¼ö : "+count);
		System.out.println(new String(b).toUpperCase());
		

	}

}
