package com.practice2.model.entity;

public class Point {
	

	protected int x;
	protected int y;

	
	public Point(){}
	public Point(int x,int y){}

	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void draw(){
		System.out.println(x);
		System.out.println(y);
	}
}
