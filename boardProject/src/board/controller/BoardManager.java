package board.controller;

import java.util.*;

import board.model.vo.Board;

public class BoardManager {
	ArrayList<Board> list = new ArrayList<Board>();
	Scanner sc = new Scanner(System.in);
	private int num = 0, index;

	public BoardManager() {
		try (ObjectInputStream ois = new ObjectInputStream(new File)){

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void writeBoard() {
		System.out.println("�� �Խñ� ���� �Դϴ�.");
		System.out.print("������ : ");
		sc.nextLine();
		System.out.print("�ۼ��� : ");
		sc.next();
		System.out.print("�۳��� : ");
		do {

		} while (true);
	}
}
