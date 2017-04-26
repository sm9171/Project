package test.staticfield;
//�ϳ��� �ڹ� ���Ͼȿ��� class�� ������ ���� �� ������
//public class�� ���� �̸����� �ϳ��ۿ� ������ ���� �ʴ´�.
public class TestStaticField {

	public static void main(String[] args) {
		System.out.println("count �� : " +StaticSample.count);
		//StaticSample.name="ȫ�浿"; ��ü�� �������� ����
		StaticSample samp = new StaticSample();
		System.out.println("name : " +samp.name);
		System.out.println("age : " +samp.age);
		System.out.println("count �� : " +StaticSample.count);
		
		StaticSample samp2 = new StaticSample("ȫ�浿",25);
		System.out.println("name : " +samp2.name);
		System.out.println("age : " +samp2.age);
		System.out.println("count �� : " +StaticSample.count);
	}

}
class StaticSample{
	String name; //�ν��Ͻ�����
	int age; //�ν��Ͻ�����
	static int count; //����(static)����, Ŭ��������
	
	public StaticSample(){
		count++;
	}

	public StaticSample(String a, int b) {
		name = a;
		age = b;
		count++;
	}

}