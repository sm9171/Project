package test.string;

public class TestStringBuilder {

	public static void main(String[] args) {
		// StringBuilder 클래스 생성자, 메소드 테스트
		StringBuffer ab = new StringBuffer("abc");
		StringBuffer ab2= ab.append(true);
		ab.append('d').append(10.0f);
		StringBuffer ab3=
				ab.append("ABC").append(123);
		System.out.println(ab);
		System.out.println(ab2);
		System.out.println(ab3);
		StringBuffer sb = new StringBuffer("쇼미더머니");
		System.out.println(sb.reverse());
		StringBuffer ss=new StringBuffer(100);
		ss.append("abcd");
		System.out.println(ss.capacity());
		System.out.println(ss.length());
		
	}

}
