package test.string;

public class TestString {

	public static void main(String[] args) {
		//String 클래스
		//자바에서 String 클래스만 예외적으로 기본자료형처럼 사용할 수 있게 하였음
		//자료형 변수명 = 초기값;
		//클래스형 레퍼런스변수 = new 생성자(초기값,...);
		String str = "apple";
		//컴파일시에 jvm 이 String str = new String("apple"); 처리함
		
		System.out.println("apple 문자열의 위치 : "+ str.hashCode());
		
		//문자열값들은 힙메모리에 문자열저장소(Literal Pool)에 따로 기록하고 있음 : java vm 이 관리함
		//문자열저장소는 같은 문자열값 두번 기록 안 함
		//한번 기록된 문자열은 변경할 수 없다.(mutable)
		
		String str2 = new String("apple");
		System.out.println("str2 가 가진 주소 : "+str2.hashCode());
		
		String str1 = "apple";
		System.out.println("str1 의 주소 : "+ str1.hashCode());
		System.out.println("str==str1 : "+(str==str1 ));
		String str3 = new String("apple");
		System.out.println("str2==str3 : "+(str2==str3 ));
		System.out.println("str3 가 가진 주소 : " + str3.hashCode());
	
		String result1 =str.toUpperCase();
		System.out.println("result : "+result1);
		System.out.println("result1.hashCode() : "+result1.hashCode());
		System.out.println("str : "+str);
		String result2 = str.replace('p','b');
		System.out.println("resulte2 : "+result2);
		System.out.println("result1.hashCode() : "+result1.hashCode());
	}

}
