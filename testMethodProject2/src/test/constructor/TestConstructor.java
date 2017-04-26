package test.constructor;

public class TestConstructor {

	public static void main(String[] args) {
		ConstructorSample samp = new ConstructorSample();
		samp.displayValue();
		
		//��������ڸ� �̿��� �� ����
		ConstructorSample copySamp = new ConstructorSample(samp);
		copySamp.displayValue();
	}

}
class ConstructorSample{
	private int num;
	private int intValue=num;//instance �������� �ڵ����� �ʱ�ȭ ��
	private double dblValue;
	
	public ConstructorSample(){
		this(10,20.3); //������ ù�ٿ��� ���� ����
//		ConstructorSample(10,20.3);
	}
	
	public ConstructorSample(int intValue,double dblValue){
		this.intValue=intValue;
		this.dblValue=dblValue;
	//this();
	}
	//���� ������ : ���ο� ��ü�� ����鼭, �ٸ� ��ü�� ���� ���� �ٷ� �����ϴ� ������
	public ConstructorSample(ConstructorSample obj){
		this.intValue=obj.intValue;
		this.dblValue=obj.dblValue;
	}
	
	public void displayValue(){
	//this();
		int k;
//		int m=k; stack�� �Ҵ�Ǵ� ������������ �ʱ�ȭ�� �ȵ�
		System.out.println("intValue : " + this.intValue);
	
	}
}