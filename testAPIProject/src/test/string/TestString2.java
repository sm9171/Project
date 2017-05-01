package test.string;

public class TestString2 {

	public static void main(String[] args) {
		// String 클래스 method 연습
		String s = new String("Hello");
		char[] c = { 'H', 'e', 'l', 'l', 'o' };
		String s2 = new String(c);
		StringBuffer ab = new StringBuffer("Hello");
		String s3 = new String(ab);
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s3);
	}

}
