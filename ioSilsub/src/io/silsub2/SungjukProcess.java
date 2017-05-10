package io.silsub2;

import java.io.*;

import java.util.Scanner;



public class SungjukProcess {
	
	public static void main(String[] args) {
//		new SungjukProcess().sungjukSave();
		new SungjukProcess().scoreRead();
	}
	
	public void sungjukSave(){
		
		Scanner sc=new Scanner(System.in);
//		DataOutputStream dout=null;
		//try with resources 문장 : 자동 close 처리해 주는 문장
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.dat"))) {
//			dout=new DataOutputStream(new FileOutputStream("score.dat"));
			do{
				
				System.out.print("국어 : ");
				int k=sc.nextInt();
				dout.writeInt(k);
				System.out.print("영어 : ");
				int e=sc.nextInt();
				dout.writeInt(e);
				System.out.print("수학 : ");
				int m=sc.nextInt();
				dout.writeInt(m);
				System.out.print("총점 : ");
				int sum=(k+e+m);
				dout.writeInt(sum);
				System.out.print("평균 : ");
				double average=((k+e+m)/3);
				dout.writeDouble(average);
				System.out.print("계속 저장하시겠습니까?(y/n) : ");
				if(sc.next().toUpperCase().charAt(0)=='N'){
					break;
					
				}
				
			}while(true);
		} catch (Exception e) {
			e.printStackTrace();
//		}finally{
//			try {
//				dout.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
	}
	
	
	public void scoreRead(){
		DataInputStream din=null;
		int count=0;
		int totalsum=0;
		double totalaverage=0;
		new SungjukProcess().sungjukSave();

		
		try {
			din = new DataInputStream(new FileInputStream("score.dat"));
			do {
				
				int k = (din.readInt());
				int e = (din.readInt());
				int m = (din.readInt());
				int sum = (din.readInt());
				double average = (din.readDouble());
				System.out.printf("%5d%5d%5d%5d%7.2f\n", k, e, m, sum, average);
				totalsum += sum;
				totalaverage += average;
				count++;
			} while (true);
		}catch(EOFException e){
			System.out.printf("%5d%15d%7.2f\n",count,totalsum/count,totalaverage/count);
			System.out.println("score.dat 파일 읽기 완료...");
		} catch (IOException e) {
			System.out.println("score.dat 파일 읽기 실패...");
			e.printStackTrace();
		}finally{
			try {
				din.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
