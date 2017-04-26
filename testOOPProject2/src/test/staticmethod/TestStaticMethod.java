package test.staticmethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		StaticMethodSample samp = new StaticMethodSample();
		System.out.println("add : " + samp.add());
		System.out.println("add : " + StaticMethodSample.add(10,20));
		StaticMethodSample.printAdd();
	}

}
class StaticMethodSample{
	private int a,b;
	
	public StaticMethodSample(){}
	
	public int add(){
		System.out.println("전달받은 주소 : " + this.hashCode());
		return this.a+this.b;
	}
	
	public static int add(int a, int b){
//		System.out.println("전달받은 주소 : " + this.hashCode()); ====static메소드 안에는 this가 없다 오류!!!
		return a+b;
	}
	public static void printAdd(){
		//static 메소드 영역 안에서는 non-static 메소드 사용 못 함
		//this 레퍼런스가 없음. 참조할 주소가 존재하지 않음
//		System.out.println("더하기 결과 : " + add());
		System.out.println("더하기 결과 :"+ add(3,5)); 
	}
}