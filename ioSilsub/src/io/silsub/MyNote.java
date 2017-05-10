package io.silsub;

import java.io.*;

import java.util.*;

public class MyNote {
	Scanner sc = new Scanner(System.in);

	public void fileSave() {
		System.out.println("������ ������ �Է��Ͻÿ�.");
		System.out.println("exit �Է½� ����");
		StringBuilder sb = new StringBuilder();
		BufferedWriter bout = null;

		do {
			String str = sc.nextLine();
			if (str.equals("exit"))
				break;
			sb.append(str);
		} while (true);
		System.out.println("���ϸ��� �Է��Ͻÿ�");
		String fileName = sc.next();
		sc.nextLine();
		try {
			bout = new BufferedWriter(new FileWriter(fileName));
			bout.write(sb.toString()+"\n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
	public void fileOpen(){
		BufferedReader fr = null;
		System.out.print("�о���� ���ϸ� : ");
		String fileName = sc.next();
		String str=null;
		char[] readData = new char[(int) new File(fileName).length()];
		try {
			fr = new BufferedReader(new FileReader(fileName));
			System.out.println("���� ���� Ȯ��");
			while((str=fr.readLine())!=null){
				System.out.println(str);
			}

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
	public void fileEdit(){
		BufferedWriter bout = null;
		StringBuilder sb = new StringBuilder();
		System.out.print("������ ���ϸ� : ");
		System.out.println();
		BufferedReader fr = null;
		String fileName = sc.next();

		char[] readDate = new char[(int) new File(fileName).length()];

		try {
			fr = new BufferedReader(new FileReader(fileName));

			System.out.println("���� ���� Ȯ��");

			String str = "";
			while ((str = fr.readLine()) != null) {
				System.out.println(str);

			}
			System.out.println("���Ͽ� �߰��� ������ �Է��ϼ���");

			do {
				str = sc.nextLine();
				if (str.equals("exit")) {
					System.out.println("������ ������ �߰��Ͻðڽ��ϱ�? (y/n)");
					if (sc.next().toUpperCase().equals("Y"))
						break;
				}
				sb.append(str + "\n");
			} while (true);
			bout = new BufferedWriter(new FileWriter(fileName, true));
			bout.write(sb.toString());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bout.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
