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
		System.out.println("1. ��Ʈ ���� �����");
		System.out.println("2. ��Ʈ ����");
		System.out.println("3. ��Ʈ ��� �����ϱ�");
		System.out.println("4. ������");
		System.out.println();
		System.out.print("�޴����� : ");
		
	}

}
