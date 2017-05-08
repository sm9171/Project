package test.file;

import java.io.*;
import java.util.*;

public class TestFileOutputStream {

	public void testMethod() {
		Scanner sc = new Scanner(System.in);
		System.out.print("저장할 파일명 : ");
		String fileName = sc.next();
		// 입력버퍼에 남은 엔터키 제거작업
		sc.nextLine();
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream(fileName);
			// 파일 출력객체 생성시에 대상 파일이 없으면
			// 자동으로 파일이 만들어짐
			System.out.println(fileName + "파일에 저장할 내용을 입력하시오");
			System.out.println("exit 입력시 종료됨.");
			int lineNumber = 1;
			do {
				System.out.println(lineNumber++ + " : ");
				String str = sc.nextLine();
				if (str.equals("exit"))
					break;
				fout.write(str.getBytes());
			} while (true);
			System.out.println("\n" + fileName + "에 저장되었습니다.");
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

	// 버퍼를 이용하는 보조스트림을 연결해서 성능을 좋게 만들어 봄
	public void testBufferedMethod(){
		Scanner sc=new Scanner(System.in);
		System.out.print("저장할 파일명 : ");
		String fileName=sc.next();
		sc.nextLine();
		
		BufferedOutputStream bout = null;
		try {
			bout =new BufferedOutputStream(new FileOutputStream(fileName,true));
			
			System.out.println(fileName + "에 저장할 내용을 입력하시오.");
			
			System.out.println("exit 입력시 종료");
			do{
				String str = sc.nextLine();
						if(str.equals("exit"))
							break;
						bout.write(str.getBytes());
			}while(true);
			System.out.println(fileName+"에 저장 완료됨.");
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
		// 파일에 값을 기록 저장하는 FileOutputStream 테스트
		// new TestFileOutputStream().testMethod();
		new TestFileOutputStream().testBufferedMethod();
	}

}
