package game;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public String start() {
		String fileName = "sentence.dat";
		String str = null;
		String str2 = null;
		int line;
		long start=0, end = 0;
		Scanner sc = new Scanner(System.in);

		try (BufferedReader fi = new BufferedReader(new FileReader(fileName));) { 						// ���� �ҷ�����.
			line = (int) (Math.random() * 55 + 1);														//���� ���� �����ϱ�

			for (int i = 0; i < line; i++) {
				str = fi.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return str;
	}
}