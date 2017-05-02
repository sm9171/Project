package exception.sample;

public class Calculator {
	public Calculator(){}
	public double divide(double a, double b) throws ZeroDivideException{
		if(b==0)
			throw new ZeroDivideException("0 으로 나눌수 없음.");
		else
			return a/b;
	}
}
