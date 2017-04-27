package oop.controller;

import java.util.Random;

import inherit.polymorphism.model.*;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		Random r =new Random();
		IShape[] iarr = new IShape[5];
		
		for(int i=0;i<iarr.length;i++){
			iarr[i]=new Circle((r.nextDouble()*100)+1);
			System.out.println(i+"번째 원의 넓이"+iarr[i].area());
			System.out.println(i+"번째 원의 둘레"+iarr[i].perimeter());

			iarr[i]=new Rectangle((r.nextDouble()*100)+1,(r.nextDouble()*100)+1);
			System.out.println(i+"번째 사각형의 넓이"+iarr[i].area());
			System.out.println(i+"번째 사각형의 둘레"+iarr[i].perimeter());

			iarr[i]=new Triangle((r.nextDouble()*100)+1,(r.nextDouble()*100)+1);
			System.out.println(i+"번째 삼각형의 넓이"+iarr[i].area());
			System.out.println(i+"번째 삼각형의 둘레"+iarr[i].perimeter());
				if(iarr[i] instanceof Triangle)
					System.out.println("빗변길이 : "+ ((Triangle)iarr[i]).getHypotenuse());
		}
	
	}

}
