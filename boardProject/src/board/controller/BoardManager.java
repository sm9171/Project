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
		System.out.println("새 게시글 쓰기 입니다.");
		System.out.print("글제목 : ");
		sc.nextLine();
		System.out.print("작성자 : ");
		sc.next();
		System.out.print("글내용 : ");
		do {

		} while (true);
	}
}
