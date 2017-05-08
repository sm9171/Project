package test.file;

import java.io.*;
import java.util.*;

public class TestFileOutputStream {

	public void testMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� : ");
		String fileName = sc.next();
		// �Է¹��ۿ� ���� ����Ű �����۾�
		sc.nextLine();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(fileName);
			// ���� ��°�ü �����ÿ� ��� ������ ������
			// �ڵ����� ������ �������
			System.out.println(fileName + "���Ͽ� ������ ������ �Է��Ͻÿ�");
			System.out.println("exit �Է½� �����.");
			int lineNumber = 1;
			do {
				System.out.println(lineNumber++ + " : ");
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;
				fout.write(str.getBytes());
			} while (true);
			System.out.println("\n" + fileName + "�� ����Ǿ����ϴ�.");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	// ���۸� �̿��ϴ� ������Ʈ���� �����ؼ� ������ ���� ����� ��
	public void testBufferedMethod(){
		Scanner sc=new Scanner(System.in);
		System.out.print("������ ���ϸ� : ");
		String fileName=sc.next();
		sc.nextLine();
		
		BufferedOutputStream bout = null;
		try {
			bout =new BufferedOutputStream(new FileOutputStream(fileName,true));
			
			System.out.println(fileName + "�� ������ ������ �Է��Ͻÿ�.");
			
			System.out.println("exit �Է½� ����");
			do{
				String str = sc.nextLine();
						if(str.equals("exit"))
							break;
						bout.write(str.getBytes());
			}while(true);
			System.out.println(fileName+"�� ���� �Ϸ��.");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}	catch(IOException e){
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				bout.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// ���Ͽ� ���� ��� �����ϴ� FileOutputStream �׽�Ʈ
		// new TestFileOutputStream().testMethod();
		new TestFileOutputStream().testBufferedMethod();
	}

}
