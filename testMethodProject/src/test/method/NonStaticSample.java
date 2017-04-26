package test.method;

import java.util.Random;
import java.util.Scanner;

public class NonStaticSample {
	public NonStaticSample(){
		
		
	}
	public void printLottoNumbers(){
		Random r= new Random();
		int a[]=new int[6];
		for(int i= 0;i<a.length;i++){
			
		a[i]=(r.nextInt(45)+1);
		System.out.println(i + "번째 수는 : " + a[i]);
		}
	
	}
	public void outputChar(int count, char ch){
		
		for(int i=0;i<count;i++)
			System.out.print(ch);
		
	}
	public char alphabette(){
		Random r= new Random();
		char a=(char)(r.nextInt(26)+65);
		return a;
	}
	public String mySubstring(String s,int beginIndex,int endIndex){
		String a=s.substring(beginIndex, endIndex);
		return a;
	}
	
	
}
