package test.file;

import java.io.*;
import java.util.*;

public class TestFileInputStream {

	public void testFileRead() {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;

		System.out.print("읽어들일 파일명 : ");
		String fileName = sc.next();

		// File readFile=new File(fileName);
		// long fileSize=readFile.length();
		// byte[] readData=new byte[(int)fileSize];
		byte[] readData = new byte[(int) new File(fileName).length()];

		try {
			fin = new FileInputStream(fileName);
			fin.read(readData);
			System.out.println("읽은 값들 확인");
			System.out.println(new String(readData));
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 보조스트림으로 버퍼 추가 테스트 메소드
	public void testBufferedFileInput() {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;
		System.out.print("읽어들일 파일명 : ");
		String fileName = sc.next();
		byte[] readData = new byte[(int) new File(fileName).length()];
		try {
			fin = new FileInputStream(fileName);
			fin.read(readData);
			System.out.println("읽은 값들 확인");
			System.out.println(new String(readData));

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// 파일로 부터 데이터를 읽어들이는 FileInputStream 테스트
		// new TestFileInputStream().testFileRead();
		new TestFileInputStream().testBufferedFileInput();
	}

}
