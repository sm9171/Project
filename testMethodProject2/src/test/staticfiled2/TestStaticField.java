package test.staticfiled2;

public class TestStaticField {
	//Field
	private static int num;
	private static double dnum;
	private static String name;
	//모든 필드가 static 일 때는 생성자 필요없음
	
	//setter and getter 도 static 이어야 함
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
