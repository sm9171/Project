package com.practice1.controller;

import com.practice1.model.vo.Book;


public class TestSilsub1 {

	public static void main(String[] args) {
		Book b1 = new Book("�ڹ��� ����","���ü�",23);
		Book b2 = new Book("������ ����","���ù�",24);
		Book copyB1 = (Book)b1.clone();
		System.out.println("�ּҰ� ������? "+(b1 == b2));
		System.out.println("������ ��� ������? "+b1.equals(b2));
		System.out.println("b1 :" +b1);
		System.out.println("copyB1 : "+copyB1);
		System.out.println("b1 : "+b1.hashCode());
		System.out.println("copyB1 : " +copyB1.hashCode());

	}

}
