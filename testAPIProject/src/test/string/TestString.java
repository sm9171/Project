package test.string;

public class TestString {

	public static void main(String[] args) {
		//String Ŭ����
		//�ڹٿ��� String Ŭ������ ���������� �⺻�ڷ���ó�� ����� �� �ְ� �Ͽ���
		//�ڷ��� ������ = �ʱⰪ;
		//Ŭ������ ���۷������� = new ������(�ʱⰪ,...);
		String str = "apple";
		//�����Ͻÿ� jvm �� String str = new String("apple"); ó����
		
		System.out.println("apple ���ڿ��� ��ġ : "+ str.hashCode());
		
		//���ڿ������� ���޸𸮿� ���ڿ������(Literal Pool)�� ���� ����ϰ� ���� : java vm �� ������
		//���ڿ�����Ҵ� ���� ���ڿ��� �ι� ��� �� ��
		//�ѹ� ��ϵ� ���ڿ��� ������ �� ����.(mutable)
		
		String str2 = new String("apple");
		System.out.println("str2 �� ���� �ּ� : "+str2.hashCode());
		
		String str1 = "apple";
		System.out.println("str1 �� �ּ� : "+ str1.hashCode());
		System.out.println("str==str1 : "+(str==str1 ));
		String str3 = new String("apple");
		System.out.println("str2==str3 : "+(str2==str3 ));
		System.out.println("str3 �� ���� �ּ� : " + str3.hashCode());
	
		String result1 =str.toUpperCase();
		System.out.println("result : "+result1);
		System.out.println("result1.hashCode() : "+result1.hashCode());
		System.out.println("str : "+str);
		String result2 = str.replace('p','b');
		System.out.println("resulte2 : "+result2);
		System.out.println("result1.hashCode() : "+result1.hashCode());
	}

}
