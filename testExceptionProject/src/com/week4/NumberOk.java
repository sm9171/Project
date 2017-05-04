package com.week4;

import java.io.*;
import java.util.Random;

public class NumberOk {
	Random r= new Random();
	int s=r.nextInt(100)+1;
	public static void main(String[] args) {
		NumberOk no = new NumberOk();
		int count=0;
		do{
			int a=no.questionNumber(no.getNumber());
			if(a==0){
				System.out.println("같다.");
				System.out.println(count + "번째에 정답입니다.");
				break;
			}
			else if(a==-1)
			{
				System.out.println("작다.");
			}
			else
				System.out.println("크다.");
			count++;
		}while(true);
		
	}
	public int getNumber() {
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수입력");
		int num;
		try {
			num = Integer.parseInt(in.readLine());
			return num;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
	public int questionNumber(int a){
		
		if(a==s){
			a=1;
		}
		else if(a<s){
			a=-1;
		}
		else
			a=1;
		return a;
	}
}
