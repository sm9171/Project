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
		System.out.println("���ܹ߻�");
	
	}
	
	
	public static void main(String[] args) throws FileNotFoundException{
		// �ݵ�� ����(Exception) ó���� �ؾ� �ϴ� ���
		new TestExceptionHandling().methodA();
	}

}
