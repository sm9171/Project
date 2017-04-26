package test.method;

public class NonStaticSampleTest {

	public static void main(String[] args) {
		NonStaticSample test= new NonStaticSample();
		test.printLottoNumbers();
		test.outputChar(2, 'c');
		System.out.println(test.alphabette());
		System.out.println(test.mySubstring("Java programing",3,6));
	}

}
