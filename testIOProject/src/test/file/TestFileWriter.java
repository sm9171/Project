package test.file;

import java.io.*;
import java.util.*;

public class TestFileWriter {

	private Scanner sc= new Scanner(System.in);
	
	public void testFileWriter(){
		FileWriter fw = null;
		System.out.print("������ ���ϸ� : ");
		String fileName=sc.next();
		sc.nextLine();
		try {
			fw=new FileWriter(fileName);
			System.out.println(fileName+"�� ����� ������ �Է��ϼ���.");
			System.out.println("exit �Է½� �����...");
			do{
				String str=sc.nextLine();
				if(str.equals("exit"))
					break;
				
				fw.write(str+"\n");
			}while(true);
			System.out.println(fileName+"�� ������ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO: handle exception
		}finally{
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public void testBufferedWriter(){
		BufferedWriter bw = null;
		System.out.print("������ ���ϸ� : ");
		String fileName=sc.next();
		sc.nextLine();
		try {
			bw =new BufferedWriter(new FileWriter(fileName));
			System.out.println(fileName+"�� ����� ������ �Է��ϼ���.");
			System.out.println("exit �Է½� �����...");
			do{
				String str=sc.nextLine();
				if(str.equals("exit"))
					break;
				
				bw.write(str+"\n");
			}while(true);
			System.out.println(fileName+"�� ������ �Ϸ�Ǿ����ϴ�.");
		} catch (IOException e) {
			// TODO: handle exception
		}finally{
		try {
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		// ���Ͽ� �����͸� ��� �����ϴ� FileWriter Ŭ���� �׽�Ʈ
//		new TestFileWriter().testFileWriter();
		new TestFileWriter().testBufferedWriter();
	}

}
