package test.recursive;

public class TestRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		int result = new RecursiveCall().fectorial(5);
		System.out.println("5! : " + result);*/
		System.out.println("5! : " +new RecursiveCall().fectorial(5));
		System.out.println("5! : " +new RecursiveCall().fectorial2(5));
	}

}

class RecursiveCall {
	public int fectorial(int value) {

		if (value == 1) {
			System.out.print(value);
			System.out.println();
			return 1;
		} 
		else {
			System.out.print(value + " * ");
			return value * fectorial(value - 1);
		}
	}
	public int fectorial2(int value){
		int result =1;
		for(int i=value;i>0;i--)
			result*=i;
		return result;
	}
}
