package ncs.test5;

public class BookArrayTest {

	public static void main(String[] args) {
		Book bArray [] = new Book[3];
		bArray[0]=new Book("�ڹ��� ����","���ü�",30000,"��������",10);
		bArray[1]=new Book("�������� �ڹ�","������",29000,"",10);
		bArray[2]=new Book("��ü���� JAVA8","�ݿ���",30000,"",10);
		for(int i=0;i<bArray.length;i++){
			System.out.println(bArray[i].getTitle()+", "+bArray[i].getAuthor()+", "+bArray[i].getPublisher()+", "+bArray[i].getPrice()+"��, "+Math.round(bArray[i].getDiscountRate())+"% ����");
			System.out.println("���ε� ���� : "+Math.round((bArray[i].getPrice()-(bArray[i].getPrice()*bArray[i].getDiscountRate())/100))+"��");
		}
	}

}
