package test.initblock;

public class TestInitBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InitBlockSample samp = new InitBlockSample(100,200);//�����ڰ� ������
	
		samp.printInfo();
	
	}

}
class InitBlockSample{
	private int num=123;		//1.����� �ʱ�ȭ 
	private static int snum=456;
	{
		num=777;//�ʱ�ȭ ��
	}
	{
		snum=888;
	}
	public InitBlockSample(int num, int snum){
		this.num = num;
		this.snum=snum;
	}
	public void printInfo(){
		System.out.println("num : " + this.num);
		System.out.println("snum : " + snum);
	}
}