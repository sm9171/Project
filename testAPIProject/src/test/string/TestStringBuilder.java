package test.string;

public class TestStringBuilder {

	public static void main(String[] args) {
		// StringBuilder Ŭ���� ������, �޼ҵ� �׽�Ʈ
		StringBuffer ab = new StringBuffer("abc");
		StringBuffer ab2= ab.append(true);
		ab.append('d').append(10.0f);
		StringBuffer ab3=
				ab.append("ABC").append(123);
		System.out.println(ab);
		System.out.println(ab2);
		System.out.println(ab3);
		StringBuffer sb = new StringBuffer("��̴��Ӵ�");
		System.out.println(sb.reverse());
		StringBuffer ss=new StringBuffer(100);
		ss.append("abcd");
		System.out.println(ss.capacity());
		System.out.println(ss.length());
		
	}

}
