package test.polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		// ������ �׽�Ʈ
		A aob = new A();
		B bob = new B();
		C cob = new C();
		
		PP.testPP(aob);
		PP.testPP(bob);
		PP.testPP(cob);
	}

}
