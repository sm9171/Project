package ncs.test6;

public class Calculate {
	public Calculate(){}
	public int sum(int a,int b){
		return a+b;
	}
	public int subtract(int a,int b){
		return a-b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public int divide(int a,int b){
		int c=0;
		if(b!=0&&b>0)
		c=a/b;
		return c;
	}
}
