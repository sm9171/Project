package test.string;

public class TestString {

	public static void main(String[] args) {
		//String Ŭ���� �׽�Ʈ
		String s1 = new String();
		String s2 = new String(new byte[]{10,20,30,40,50});
		String s3 = new String(new char[]{'A','a','B','b'});
		String s4 = new String("java programming");
		String s5 = new String(new StringBuffer());
		String s6 = new String(new StringBuilder());
		
		String result1 = String.valueOf(false);
		System.out.println("result1 : "+result1+ ", " + result1.length());
		
		//non-static �̸鼭 ��ȯ�� �ְ� �Ű����� �ִ� �޼ҵ�
		char ch = s4.charAt(9);
		System.out.println("10��°���� : " + ch);
		System.out.println("3��°���� : " + s4.charAt(2));
		
		//non-static �̸鼭 ��ȯ�� �ְ� �Ű����� ���� �޼ҵ�
		int len = s4.length();
		System.out.println("s4 ���ڰ��� : " + len);
		System.out.println("s4 ���ڰ��� : " + s4.length());
		
		//non-static �̸鼭 ��ȯ�� ���� �Ű����� �ִ� �޼ҵ�
		char[] dstStr = new char[5];
		s4.getChars(5, 10, dstStr, 0);
		for(int i = 0;i<dstStr.length;i++)
			System.out.println(i+" : " +dstStr[i]);
			System.out.println();
		
		
	}

}
