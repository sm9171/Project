package io.silsub;

import java.util.Scanner;

public class TestMyNote {

	public static void main(String[] args) {
		new TestMyNote().menu();

	}
	public static void menu(){
		MyNote n=new MyNote();
		Scanner sc=new Scanner(System.in);
		do{
		System.out.println("******   MyNote  *******");
		System.out.println();
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 끝내기");
		System.out.println();
		System.out.print("메뉴선택 : ");
		switch(sc.nextInt()){
		case 1: n.fileSave(); break;
		case 2: n.fileOpen(); break;
		case 3: n.fileEdit(); break;
		case 4: return;
		}
		}while(true);
	}

}
