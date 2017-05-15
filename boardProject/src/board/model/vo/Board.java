package board.model.vo;

import java.util.*;

public class Board {
private int boardNo;
private String boardTitle;
private String boardWriter;
private Date boardDate;
private String boardContent;
private int readCount;

public Board(){}
public Board(int boardNo, String boardTitle, String boardWriter, Date boardDate, String boardContent, int readCount) {
	this.boardNo = boardNo;
	this.boardTitle = boardTitle;
	this.boardWriter = boardWriter;
	this.boardDate = boardDate;
	this.boardContent = boardContent;
	this.readCount = readCount;
}


public int getBoardNo() {
	return boardNo;
}
public String getBoardTitle() {
	return boardTitle;
}
public String getBoardWriter() {
	return boardWriter;
}
public Date getBoardDate() {
	return boardDate;
}
public String getBoardContent() {
	return boardContent;
}
public int getReadCount() {
	return readCount;
}
public void setBoardNo(int boardNo) {
	this.boardNo = boardNo;
}
public void setBoardTitle(String boardTitle) {
	this.boardTitle = boardTitle;
}
public void setBoardWriter(String boardWriter) {
	this.boardWriter = boardWriter;
}
public void setBoardDate(Date boardDate) {
	this.boardDate = boardDate;
}
public void setBoardContent(String boardContent) {
	this.boardContent = boardContent;
}
public void setReadCount(int readCount) {
	this.readCount = readCount;
}

@Override
public String toString() {
	return boardNo + ", " + boardTitle + ", " + boardWriter + ", "+ boardDate + ", " + boardContent + ", " + readCount;
}

}
