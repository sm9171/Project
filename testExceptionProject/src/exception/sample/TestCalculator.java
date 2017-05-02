package exception.sample;

public class TestCalculator {

	public void testMethod(){
		try {
			double result = new Calculator().divide(10.2, 3.0);
			System.out.println("result : "+ result);
		} catch (ZeroDivideException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) {
		// ��������� ����Ŭ���� �۵� �׽�Ʈ
		new TestCalculator().testMethod();

	}

}
