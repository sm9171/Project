package test.exception;

import java.io.*;
import java.sql.*;

public class TestTryCatch {

	public void testMethod() {
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
			System.out.println("���ܹ߻�...");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} /*catch (IOException e) {
			e.printStackTrace();
			}*/
		
		catch(IOException e ){
			e.printStackTrace();
		
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("�ݵ�ý����...");
		}
	}

	public static void main(String[] args) {
		new TestTryCatch().testMethod();
	}

}
