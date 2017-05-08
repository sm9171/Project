package test.file;

import java.io.*;
import java.util.*;

public class TestFileReader {
	Scanner sc = new Scanner(System.in);

	public void testFileReader() {
		FileReader fr = null;
		System.out.print("읽어들일 파일명 : ");
		String fileName = sc.next();
		char[] readData = new char[(int) new File(fileName).length()];
		try {
			fr = new FileReader(fileName);
			fr.read(readData);
			System.out.println("읽은 값들 확인");
			System.out.println(new String(readData));

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void testBufferedReader() {
		BufferedReader br=null;
		System.out.print("읽어들일 파일명 : ");
		String fileName = sc.next();
		char[] readData = new char[(int) new File(fileName).length()];
		try {
			br = new BufferedReader(new FileReader(fileName));
			br.read(readData);
			System.out.println("읽은 값들 확인");
			System.out.println(new String(readData));

		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
//		new TestFileReader().testFileReader();
		new TestFileReader().testBufferedReader();
	}

}
