package ncs4.test5;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookListTest {

	public static void main(String[] args) {

		BookListTest test5 = new BookListTest();
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		test5.storeList(list);
		
		test5.saveFile(list);
		
		List<Book> booksList = test5.loadFile();
		
		test5.printList(booksList);
		
	}
	
	public void storeList(List<Book> list){
		list.add(new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.15));
		list.add(new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.2));
		list.add(new Book("객체지향 JAVA8", "금영욱", 30000, "북스홈", 0.1));
	}
	
	public void saveFile(List<Book> list){
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"));) {
			oos.writeObject(list);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<Book> loadFile(){
		ArrayList<Book> list = new ArrayList<Book>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"));){
			while(true){
			list.add((Book)ois.readObject());
			}
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return list;
	}
	
	public void printList(List<Book> list){
		for(Book b : list){
			System.out.println(b);
			System.out.println("할인된 가격 : "+(int)(b.getPrice()-(b.getPrice()*b.getDiscountRate()))+"원");
		}
	}
	
}
