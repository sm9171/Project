package io.silsub;

import java.util.Scanner;

public class TestMyNote {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
//		new TestMyNote().menu();
//		new MyNote().fileSave();
		new MyNote().fileOpen();
	}
	public static void menu(){
		System.out.println("******   MyNote  *******");
		System.out.println();
		System.out.println("1. 노트 새로 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 열어서 수정하기");
		System.out.println("4. 끝내기");
		System.out.println();
		System.out.print("메뉴선택 : ");
		
	}

}
