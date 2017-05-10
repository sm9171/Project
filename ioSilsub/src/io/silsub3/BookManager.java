package io.silsub3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public BookManager(){}
	public void fileSave() {
		try(ObjectOutputStream objOut=  new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			Book [] book=new Book[5];
			Calendar c=new GregorianCalendar();
			for(int i = 0;i<book.length;i++){
			System.out.print("책제목 : ");
			String title =sc.next();
			System.out.print("저자명명 : ");
			String author =sc.next();
			System.out.print("가격 : ");
			int price =sc.nextInt();
			System.out.print("출판년 : ");
			int year = sc.nextInt();
			System.out.print("출판월 : ");
			int month = sc.nextInt();
			System.out.print("출판일 : ");
			int date = sc.nextInt();
			System.out.print("할인율 : ");
			double discountRate =sc.nextDouble();
			c.set(year,month,date);
			book[i]=new Book(title,author,price,c.getInstance(),discountRate);
			objOut.writeObject(book[i]);
			}
			System.out.println("Book.dat에 저장완료");
			
		} catch (Exception e) {
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
