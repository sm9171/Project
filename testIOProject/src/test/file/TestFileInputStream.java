package test.file;

import java.io.*;
import java.util.*;

public class TestFileInputStream {

	public void testFileRead() {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;

		System.out.print("�о���� ���ϸ� : ");
		String fileName = sc.next();

		// File readFile=new File(fileName);
		// long fileSize=readFile.length();
		// byte[] readData=new byte[(int)fileSize];
		byte[] readData = new byte[(int) new File(fileName).length()];

		try {
			fin = new FileInputStream(fileName);
			fin.read(readData);
			System.out.println("���� ���� Ȯ��");
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

	// ������Ʈ������ ���� �߰� �׽�Ʈ �޼ҵ�
	public void testBufferedFileInput() {
		Scanner sc = new Scanner(System.in);
		FileInputStream fin = null;
		System.out.print("�о���� ���ϸ� : ");
		String fileName = sc.next();
		byte[] readData = new byte[(int) new File(fileName).length()];
		try {
			fin = new FileInputStream(fileName);
			fin.read(readData);
			System.out.println("���� ���� Ȯ��");
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
		// ���Ϸ� ���� �����͸� �о���̴� FileInputStream �׽�Ʈ
		// new TestFileInputStream().testFileRead();
		new TestFileInputStream().testBufferedFileInput();
	}

}
