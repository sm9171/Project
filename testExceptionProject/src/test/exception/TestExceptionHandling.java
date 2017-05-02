package test.exception;
import java.io.*;
public class TestExceptionHandling {

	public void methodA()throws FileNotFoundException{
		methodB();
	}
	public void methodB()throws FileNotFoundException{
		methodC();
	}
	public void methodC() throws FileNotFoundException{
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream("sample.dat"));
		System.out.println("예외발생");
	
	}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		// 반드시 예외(Exception) 처리를 해야 하는 경우
		new TestExceptionHandling().methodA();
	}

}
