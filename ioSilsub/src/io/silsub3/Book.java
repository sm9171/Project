package io.silsub3;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Book implements Serializable{
	private String title;
	private String author;
	private int price;
	private String dates;
	private double discountRate;
	public Book(){}
	
	public Book(String title, String author, int price, String dates, double discountRate) {
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
	public String getDates() {
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
	public void setDates(String dates) {
		this.dates = dates;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	@Override
	public String toString() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY'³â' MM'¿ù' dd'ÀÏ'");
		try {
			cal.setTime(sdf.parse(dates));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return title + ", " + author + ", " + price + ", " + sdf.format(dates) + ", " + discountRate;
	}
	
	
}
