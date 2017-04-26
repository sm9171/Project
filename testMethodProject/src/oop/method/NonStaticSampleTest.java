package oop.method;

public class NonStaticSampleTest {

	public static void main(String[] args) {
	NonStaticSample test=new NonStaticSample();
	System.out.println(test.intArrayAllocation(3));
	test.display(new int[]{20,30,40});
	test.swap(new int[]{20,30,40}, 0, 2);
	test.sortDescending(new int[]{1,2,3,4});
	test.sortAscending(new int[]{1,2,3,4});
	System.out.println("포함된 문자 갯수는 : " + test.countChar("asbsdb", 'a'));
	System.out.println(test.totalValue(1,3));
	System.out.println(test.pCharAt("segeg",2));
	System.out.println(test.pConcat("나","상민"));
	
	}
	

}
