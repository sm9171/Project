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
			System.out.print("å���� : ");
			String title =sc.next();
			System.out.print("���ڸ�� : ");
			String author =sc.next();
			System.out.print("���� : ");
			int price =sc.nextInt();
			System.out.print("���ǳ� : ");
			int year = sc.nextInt();
			System.out.print("���ǿ� : ");
			int month = sc.nextInt();
			System.out.print("������ : ");
			int date = sc.nextInt();
			System.out.print("������ : ");
			double discountRate =sc.nextDouble();
			c.set(year,month,date);
			book[i]=new Book(title,author,price,c.getInstance(),discountRate);
			objOut.writeObject(book[i]);
			}
			System.out.println("Book.dat�� ����Ϸ�");
			
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
			System.out.print("books.dat �б�Ϸ�!");
		}catch(IOException e){
		System.out.print("books.dat �б� ����..");	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
