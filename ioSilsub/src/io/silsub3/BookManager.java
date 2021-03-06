package io.silsub3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public BookManager(){super();}
	public void fileSave() {
		Book[] books = new Book[]{
				new Book("자바의정석", "김을동", 30000, new GregorianCalendar(1991, 1, 1), 0.5),
				new Book("하악하악", "문재인", 45000, new GregorianCalendar(1992, 2, 2), 0.2),
				new Book("물은 답을 알고있다", "아이작", 30000, new GregorianCalendar(1993, 3, 3), 0.1),
				new Book("열혈강의", "김삿갓", 15000, new GregorianCalendar(1994, 4, 4), 0.3),
				new Book("빅피처", "데이비드", 10000, new GregorianCalendar(1995, 5, 5), 0.05)};
		
		try(ObjectOutputStream objOut=  new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			
			
		
			

			for(Book b : books)
				objOut.writeObject(b);
			
			System.out.println("Book.dat에 저장완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void fileRead() {
		try (ObjectInputStream objin=new ObjectInputStream(new FileInputStream("books.dat"))){
			Book [] book=new Book[10];
do{
			System.out.println(objin.readObject());
			}while(true);
		}catch(EOFException e){
			System.out.print("books.dat 읽기완료!");
		}catch(IOException e){
		System.out.print("books.dat 읽기 실패..");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
