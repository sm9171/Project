package test.math;

public class TestMath {

	public static void main(String[] args) {
		//	static field, static method ��� �׽�Ʈ
		System.out.println("Math.E : " + Math.E);
		//Math.E = 3.5; final�̶� �Ұ���
		System.out.println("Math.PI : " + Math.PI);
		
		//Math math = new Math();
		//static �̸鼭 �Ű������� �ְ� ��ȯ���� �ִ� �޼ҵ�
		double result1 = Math.abs(-3.5);
		System.out.println("result1 : " + result1);
		//��ȯ���� �ִ� �޼ҵ�� �ٸ� �޼ҵ� �ȿ� ��� ����
		//���� ���Ǵ� ��ġ�� �ٷ� �޼ҵ� ����� �� ����
		System.out.println("��ȯ�� : " + Math.abs(-3.5));
		int sum = Math.addExact(100, 200);
		System.out.println("sum : "+sum);
		System.out.println("sum : "+Math.addExact(100, 200));
		
		//static �̸鼭 �Ű������� ���� ��ȯ���� �ִ� �޼ҵ�
		double result2 = Math.random();
		System.out.println("result2 : " + result2);
		System.out.println("result2 : " + Math.random());
	}

}
