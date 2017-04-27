package com.practice2.controller;

import com.practice2.model.entity.*;

public class Main {

	public static void main(String[] args) {
		Circle [] c=new Circle[3];
		c[0]=new Circle(3,3,5);
		c[1]=new Circle(3,5,2);
		c[2]= new Circle(3,5,6);
		Rectangle [] r=new Rectangle[3];
		r[0]=new Rectangle(3,4,6,7);
		r[1]=new Rectangle(3,3,6,7);
		r[2]=new Rectangle(3,5,6,7);
//		Point [] p=new Point[5];
/*		p[0]=new Point(3,5);
		p[1]=new Point(5,5);
		p[2]=new Point(7,5);
		p[3]=new Point(8,5);
		p[4]=new Point(5,5);*/
		for(int i=0;i<c.length;i++){
			c[i].draw();
			System.out.println();
		}
		
		for(int i=0;i<r.length;i++){
			r[i].draw();
			System.out.println();
		}
	}

}
