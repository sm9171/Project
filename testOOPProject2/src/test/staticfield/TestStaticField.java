package test.staticfield;
//하나의 자바 파일안에는 class를 여러개 만들 수 있지만
//public class는 파일 이름으로 하나밖에 지정이 되지 않는다.
public class TestStaticField {

	public static void main(String[] args) {
		System.out.println("count 값 : " +StaticSample.count);
		//StaticSample.name="홍길동"; 객체가 존재하지 않음
		StaticSample samp = new StaticSample();
		System.out.println("name : " +samp.name);
		System.out.println("age : " +samp.age);
		System.out.println("count 값 : " +StaticSample.count);
		
		StaticSample samp2 = new StaticSample("홍길동",25);
		System.out.println("name : " +samp2.name);
		System.out.println("age : " +samp2.age);
		System.out.println("count 값 : " +StaticSample.count);
	}

}
class StaticSample{
	String name; //인스턴스변수
	int age; //인스턴스변수
	static int count; //정적(static)변수, 클래스변수
	
	public StaticSample(){
		count++;
	}

	public StaticSample(String a, int b) {
		name = a;
		age = b;
		count++;
	}

}