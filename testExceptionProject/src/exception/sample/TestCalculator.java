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
		// 사용자정의 예외클래스 작동 테스트
		new TestCalculator().testMethod();

	}

}
