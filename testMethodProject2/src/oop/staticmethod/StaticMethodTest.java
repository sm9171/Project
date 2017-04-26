package oop.staticmethod;

public class StaticMethodTest {

	public static void main(String[] args) {
		StaticMethod.setValue("apple");
		System.out.println("value : "+StaticMethod.getValue());
		StaticMethod.toUpper();
		System.out.println("value : " + StaticMethod.getValue());
		StaticMethod.setChar(0, 'b');
		System.out.println("value : " + StaticMethod.getValue());
		System.out.println("length : "+ StaticMethod.valueLength());
		
		String result=StaticMethod.valueConcat(" banana");
				System.out.println("result : " +result);
	}

}
