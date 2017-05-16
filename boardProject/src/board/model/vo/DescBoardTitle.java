package board.model.vo;

import java.util.Comparator;

public class DescBoardTitle implements Comparator {
	public DescBoardTitle() {
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		int result = 0;
		if (obj1 instanceof Board && obj2 instanceof Board) {
			Board b1 = (Board) obj1;
			Board b2 = (Board) obj2;

			result = b1.getBoardTitle().compareTo(b2.getBoardTitle());
		}
		return -result;
	}
}
