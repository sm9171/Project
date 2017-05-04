package day18.silsub;

import java.util.Scanner;


public class TestSilsub {
	Scanner sc = new Scanner(System.in);
	public void silsub1(){
		System.out.print("���ڿ��� �Է����ּ��� : ");
		try{
			int count = new CharacterProcess().countAlpha(sc.nextLine());
			System.out.println("count : " + count);
		} catch (CharCheckException e){
			e.printStackTrace();
		} 
	}
	public void silsub2(){
		System.out.print("ù��° ���� �Է� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է� : ");
		int b = sc.nextInt();
		try{
			boolean flag = new NumberProcess().checkDouble(a, b);
			if (flag == true)
				System.out.println(a + "�� " + b + "�� ����̴�");
			else
				System.out.println(a + "�� " + b + "�� ����� �ƴϴ�");
		} catch (NumberRangeException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {

		new TestSilsub().silsub2();
	

	}

}
