package oop.controller;

import java.util.Random;

import inherit.polymorphism.model.*;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		Random r =new Random();
		IShape[] iarr = new IShape[5];
		
		for(int i=0;i<iarr.length;i++){
			iarr[i]=new Circle((r.nextDouble()*100)+1);
			System.out.println(i+"��° ���� ����"+iarr[i].area());
			System.out.println(i+"��° ���� �ѷ�"+iarr[i].perimeter());

			iarr[i]=new Rectangle((r.nextDouble()*100)+1,(r.nextDouble()*100)+1);
			System.out.println(i+"��° �簢���� ����"+iarr[i].area());
			System.out.println(i+"��° �簢���� �ѷ�"+iarr[i].perimeter());

			iarr[i]=new Triangle((r.nextDouble()*100)+1,(r.nextDouble()*100)+1);
			System.out.println(i+"��° �ﰢ���� ����"+iarr[i].area());
			System.out.println(i+"��° �ﰢ���� �ѷ�"+iarr[i].perimeter());
				if(iarr[i] instanceof Triangle)
					System.out.println("�������� : "+ ((Triangle)iarr[i]).getHypotenuse());
		}
	
	}

}
