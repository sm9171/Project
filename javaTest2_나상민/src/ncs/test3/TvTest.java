package ncs.test3;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray [] = new Tv[3];
		
		tvArray[0]=new Tv();
		tvArray[0].setName("INFINIA");
		tvArray[0].setPrice(1500000);
		tvArray[0].setDescription("LED TV");
		
		tvArray[1]=new Tv();
		tvArray[1].setName("XCANVAS");
		tvArray[1].setPrice(1000000 );
		tvArray[1].setDescription("LCD TV");
		
		tvArray[2]=new Tv();
		tvArray[2].setName("CINEMA");
		tvArray[2].setPrice(2000000 );
		tvArray[2].setDescription("LED TV");
	
	for(int i=0;i<tvArray.length;i++)
		System.out.println(tvArray[i].toString());
	String max;
	String min;
	if(tvArray[0].getPrice()>tvArray[1].getPrice()&&tvArray[0].getPrice()>tvArray[2].getPrice())
		max=tvArray[0].getName();
	else if(tvArray[1].getPrice()>tvArray[0].getPrice()&&tvArray[1].getPrice()>tvArray[2].getPrice())
		max=tvArray[1].getName();
	else
		max=tvArray[2].getName();
	
	if(tvArray[0].getPrice()<tvArray[1].getPrice()&&tvArray[0].getPrice()<tvArray[2].getPrice())
		min=tvArray[0].getName();
	else if(tvArray[1].getPrice()<tvArray[0].getPrice()&&tvArray[1].getPrice()<tvArray[2].getPrice())
		min=tvArray[1].getName();
	else
		min=tvArray[2].getName();
	
	System.out.println("가격이 가장 비싼 제품: "+max);
	System.out.println("가격이 가장 싼 제품: "+min);
	}

}
