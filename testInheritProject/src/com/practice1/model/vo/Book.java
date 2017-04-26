package com.practice1.model.vo;

import inherit.sample.Circle;
import inherit.sample.Shape;

public class Book {
	private String title;
	private String author;
	private int price;
	public Book(){}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public Object clone() {
		Book b= new Book();
		b.title=this.title;
		b.author=this.author;
		b.price=this.price;
		return b;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Book other= (Book)obj;
		if(this.title.equals(other.title)&& this.author == other.author && this.price==other.price)
			result =true;
		return result;
	}
	@Override
	public String toString() {
		return this.title+", "+this.author+", "+this.price;
	}
	
	
}
