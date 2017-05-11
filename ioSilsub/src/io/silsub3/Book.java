package io.silsub3;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private Calendar dates;
	private double discountRate;
	public Book(){}
	
	public Book(String title, String author, int price, Calendar dates, double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
		this.discountRate = discountRate;
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
	public Calendar getDates() {
		return dates;
	}
	public double getDiscountRate() {
		return discountRate;
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
	public void setDates(Calendar dates) {
		this.dates = dates;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY'³â' MM'¿ù' dd'ÀÏ'");
		
		return title + ", " + author + ", " + price + ", " + sdf.format(dates.getTime()) + ", " + discountRate;
	}
	
	
}
