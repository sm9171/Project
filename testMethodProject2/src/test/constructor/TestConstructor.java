package test.constructor;

public class TestConstructor {

	public static void main(String[] args) {
		ConstructorSample samp = new ConstructorSample();
		samp.displayValue();
		
		//복사생성자를 이용한 값 복사
		ConstructorSample copySamp = new ConstructorSample(samp);
		copySamp.displayValue();
	}

}
class ConstructorSample{
	private int num;
	private int intValue=num;//instance 변수값은 자동으로 초기화 됨
	private double dblValue;
	
	public ConstructorSample(){
		this(10,20.3); //생성자 첫줄에만 생성 가능
//		ConstructorSample(10,20.3);
	}
	
	public ConstructorSample(int intValue,double dblValue){
		this.intValue=intValue;
		this.dblValue=dblValue;
	//this();
	}
	//복사 생성자 : 새로운 객체를 만들면서, 다른 객체가 가진 값을 바로 복사하는 생성자
	public ConstructorSample(ConstructorSample obj){
		this.intValue=obj.intValue;
		this.dblValue=obj.dblValue;
	}
	
	public void displayValue(){
	//this();
		int k;
//		int m=k; stack에 할당되는 지역변수에는 초기화가 안됨
		System.out.println("intValue : " + this.intValue);
	
	}
}