package test.staticfiled2;

public class TestStaticField {
	//Field
	private static int num;
	private static double dnum;
	private static String name;
	//��� �ʵ尡 static �� ���� ������ �ʿ����
	
	//setter and getter �� static �̾�� ��
	public static void setNum(int n){
		num=n;
	}
	public static int getNum(){
		return num;
	}
	public static void main(String [] args){
		System.out.println("num : " +num);
		setNum(7);
		System.out.println("num : " + getNum());
	}
}
