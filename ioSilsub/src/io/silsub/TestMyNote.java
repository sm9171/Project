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
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("4. ������");
		System.out.println();
		System.out.print("�޴����� : ");
		switch(sc.nextInt()){
		case 1: n.fileSave(); break;
		case 2: n.fileOpen(); break;
		case 3: n.fileEdit(); break;
		case 4: return;
		}
		}while(true);
	}

}
