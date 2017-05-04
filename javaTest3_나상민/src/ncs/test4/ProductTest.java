package ncs.test4;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p=new Product("°¶·°½Ã s7",563500,3);
		System.out.println(p.information());
		System.out.println("ÃÑ ±¸¸Å °¡°Ý : "+(p.getPrice()*p.getQuantity())+" ¿ø");
	}

}
