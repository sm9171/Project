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
		System.out.println("���޹��� �ּ� : " + this.hashCode());
		return this.a+this.b;
	}
	
	public static int add(int a, int b){
//		System.out.println("���޹��� �ּ� : " + this.hashCode()); ====static�޼ҵ� �ȿ��� this�� ���� ����!!!
		return a+b;
	}
	public static void printAdd(){
		//static �޼ҵ� ���� �ȿ����� non-static �޼ҵ� ��� �� ��
		//this ���۷����� ����. ������ �ּҰ� �������� ����
//		System.out.println("���ϱ� ��� : " + add());
		System.out.println("���ϱ� ��� :"+ add(3,5)); 
	}
}