package day18.silsub;

public class NumberProcess {
	public NumberProcess() {
	}

	public boolean checkDouble(int a, int b) throws NumberRangeException{
		if(a>0&&a<101&&b>0&&b<101){
		if(a%b==0)
			return true;
		else
			return false;
		}
		else
			throw new NumberRangeException("1부터 100사이의 값이 아닙니다.");
		
	}

}
