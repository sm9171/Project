package test.file;

import java.io.*;
import java.util.*;

public class TestFileWriter {

	private Scanner sc= new Scanner(System.in);
	
	public void testFileWriter(){
		FileWriter fw = null;
		System.out.print("저장할 파일명 : ");
		String fileName=sc.next();
		sc.nextLine();
		try {
			fw=new FileWriter(fileName);
			System.out.println(fileName+"에 기록할 내용을 입력하세요.");
			System.out.println("exit 입력시 종료됨...");
			do{
				String str=sc.nextLine();
				if(str.equals("exit"))
					break;
				
				fw.write(str+"\n");
			}while(true);
			System.out.println(fileName+"에 저장이 완료되었습니다.");
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
		System.out.print("저장할 파일명 : ");
		String fileName=sc.next();
		sc.nextLine();
		try {
			bw =new BufferedWriter(new FileWriter(fileName));
			System.out.println(fileName+"에 기록할 내용을 입력하세요.");
			System.out.println("exit 입력시 종료됨...");
			do{
				String str=sc.nextLine();
				if(str.equals("exit"))
					break;
				
				bw.write(str+"\n");
			}while(true);
			System.out.println(fileName+"에 저장이 완료되었습니다.");
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
		// 파일에 데이터를 기록 저장하는 FileWriter 클래스 테스트
//		new TestFileWriter().testFileWriter();
		new TestFileWriter().testBufferedWriter();
	}

}
