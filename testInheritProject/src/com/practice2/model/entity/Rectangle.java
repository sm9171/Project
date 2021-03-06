package com.practice2.model.entity;

public class Rectangle extends Point{

	private int width;
	private int height;
	
	public Rectangle(){}
	public Rectangle(int x, int y, int width, int height){
		super(x,y);
		this.width=width;
		this.height=height;
	}
	@Override
	public void draw(){
		super.draw();
		System.out.println("사각형 면적 : "+Math.round(width*height*10)/10.0);
		System.out.println("사각형 둘레 : "+Math.round(2*(width+height)*10)/10.0);
	}
}
