package ncs.test7;

public class BookTest {

	public static void main(String[] args) {
		Book bookArray [] = new Book[5];
		new Book();
		double sum=0;
		bookArray[0]=new Book("IT", "SQL Plus", 50000.0, 5.0);
		bookArray[1]=new Book("IT", "Java 2.0", 40000.0, 3.0);
		bookArray[2]=new Book("IT", "JSP Servlet", 60000.0, 6.0 );
		bookArray[3]=new Book("Nobel", "davincicode", 30000.0, 10.0 );
		bookArray[4]=new Book("Nobel", "cloven hoof", 50000.0, 15.0 );
		for(int i=0;i<bookArray.length;i++)
		{
			System.out.println(bookArray[i].getCategory()+"  "+bookArray[i].getBookName()+"  "+bookArray[i].getBookPrice()+"원  "+bookArray[i].getBookDiscountRate()+"%");
			sum+=bookArray[i].getBookPrice();
		}
		System.out.println();
		System.out.println("책 가격의 합 : "+sum+"원");
	}

}
