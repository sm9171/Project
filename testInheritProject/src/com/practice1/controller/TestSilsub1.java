package com.practice1.controller;

import com.practice1.model.vo.Book;


public class TestSilsub1 {

	public static void main(String[] args) {
		Book b1 = new Book("자바의 정석","남궁성",23);
		Book b2 = new Book("수학의 정석","남궁민",24);
		Book copyB1 = (Book)b1.clone();
		System.out.println("주소가 같은지? "+(b1 == b2));
		System.out.println("값들이 모두 같은지? "+b1.equals(b2));
		System.out.println("b1 :" +b1);
		System.out.println("copyB1 : "+copyB1);
		System.out.println("b1 : "+b1.hashCode());
		System.out.println("copyB1 : " +copyB1.hashCode());

	}

}
