package note.view;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class NoteMenu implements ActionListener {
	// Field
	private JMenuBar menuBar;
	private JPopupMenu popupMenu;
	// 팝업이 속할 프레임 지정용
	private JFrame parentFrame;

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu formatMenu;
	private JMenu viewMenu;
	private JMenu helpMenu;

	// 파일 메뉴
	private JMenuItem fileNew;
	private JMenuItem fileOpen;
	private JMenuItem fileSave;
	private JMenuItem fileSaveAs;
	private JMenuItem filePageSetup;
	private JMenuItem filePrint;
	private JMenuItem fileExit;

	// 보기 메뉴
	private JCheckBoxMenuItem viewStatus;

	// 서식 메뉴
	private JMenuItem formatWhiteSpace;
	private JMenuItem formatFont;

	// 도움말 메뉴
	private JMenuItem helpView;
	private JMenuItem helpAbout;

	// 편집 메뉴
	private JMenuItem editUndo;
	private JMenuItem editCopy;
	private JMenuItem editCut;
	private JMenuItem editPaste;
	private JMenuItem editDelete;
	private JMenuItem editFind;
	private JMenuItem editFindNext;
	private JMenuItem editReplace;
	private JMenuItem editMove;
	private JMenuItem editSelectAll;
	private JMenuItem editDateTime;

	public NoteMenu() {
		menuBar = new JMenuBar();

		makeFileMenu();
		makeEditMenu();
		makeFormatMenu();
		makeViewMenu();
		makeHelpMenu();	
		makePopupMenu();

		// 메뉴바에 메뉴 추가
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
	}

	// 팝업메뉴 처리용 프레임 초기화 생성자
	public NoteMenu(JFrame parentFrame) {
		this();
		this.parentFrame = parentFrame;
		
	}

	// menuBar getter
	public JMenuBar getMenuBar() {
		return menuBar;
	}
	
	public JPopupMenu getPopupMenu(){
		return this.popupMenu;
	}

	private void makeFileMenu() {
		// 파일 메뉴 메뉴아이템 생성 추가
		fileNew = new JMenuItem("새로 만들기(N)", KeyEvent.VK_N);
		fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileNew.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileOpen = new JMenuItem("열기(O)...");
		fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileOpen.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileSave = new JMenuItem("저장(S)");
		fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileSave.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileSaveAs = new JMenuItem("다른 이름으로 저장(A)...");
		fileSaveAs.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		filePageSetup = new JMenuItem("페이지 설정(U)...");
		filePageSetup.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		filePrint = new JMenuItem("인쇄(P)...");
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		filePrint.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileExit = new JMenuItem("끝내기(X)");
		fileExit.addActionListener(new FileMenuEventHandler(this, parentFrame));

		fileMenu = new JMenu("파일(F)");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.add(fileNew);
		fileMenu.add(fileOpen);
		fileMenu.add(fileSave);
		fileMenu.add(fileSaveAs);
		fileMenu.addSeparator(); // 구분선 넣기
		fileMenu.add(filePageSetup);
		fileMenu.add(filePrint);
		fileMenu.addSeparator();
		fileMenu.add(fileExit);
	}
	
	private void makeEditMenu() {
		// 편집 메뉴 아이템 구성
		editUndo = new JMenuItem("실행 취소(U)");
		editUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		editUndo.setEnabled(false);
		editUndo.addActionListener(this);
		
		editCut = new JMenuItem("잘라내기(T)");
		editCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		editCut.setEnabled(false);
		editCut.addActionListener(this);
		
		editCopy = new JMenuItem("복사(C)");
		editCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		editCopy.setEnabled(false);
		editCopy.addActionListener(this);
		
		editPaste = new JMenuItem("붙여넣기(P)");
		editPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		editPaste.addActionListener(this);
		
		editDelete = new JMenuItem("삭제(L)");
		editDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		editDelete.addActionListener(this);
		editDelete.setEnabled(false);
		
		editFind = new JMenuItem("찾기(F)...");
		editFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		editFind.addActionListener(this);
		
		editFindNext = new JMenuItem("다음 찾기(N)");
		editFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		editFindNext.addActionListener(this);
		
		editReplace = new JMenuItem("바꾸기(R)...");
		editReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		editReplace.addActionListener(this);
		
		editMove = new JMenuItem("이동(G)...");
		editMove.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		editMove.addActionListener(this);
		
		editDateTime = new JMenuItem("날짜/시간");
		editDateTime.addActionListener(this);
		
		editSelectAll = new JMenuItem("모두 선택(A)");
		editSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		editSelectAll.addActionListener(this);

		editMenu = new JMenu("편집(E)");
		editMenu.add(editUndo);
		editMenu.addSeparator();
		editMenu.add(editCut);
		editMenu.add(editCopy);
		editMenu.add(editPaste);
		editMenu.add(editDelete);
		editMenu.addSeparator();
		editMenu.add(editFind);
		editMenu.add(editFindNext);
		editMenu.add(editReplace);
		editMenu.add(editMove);
		editMenu.addSeparator();
	}

	private void makeFormatMenu() {
		// 서식 메뉴 아이템 구성
		formatWhiteSpace = new JMenuItem("자동 줄바꿈(W)");
		formatFont = new JMenuItem("글꼴(F)...");

		formatMenu = new JMenu("서식(O)");
		formatMenu.add(formatWhiteSpace);
		formatMenu.add(formatFont);
	}

	private void makeViewMenu() {
		// 보기 메뉴 아이템 구성
		viewStatus = new JCheckBoxMenuItem("상태표시줄(S)", false);

		viewMenu = new JMenu("보기(V)");
		viewMenu.add(viewStatus);
	}

	private void makeHelpMenu() {
		// 도움말 메뉴 아이템 구성
		helpView = new JMenuItem("도움말 보기(H)");
		helpView.addActionListener(this);
		helpAbout = new JMenuItem("내 메모장 정보(A)");
		helpAbout.addActionListener(this);
		
		helpMenu = new JMenu("도움말(H)");
		helpMenu.add(helpView);
		helpMenu.add(helpAbout);
	}
		

	public void makePopupMenu(){
		popupMenu = new JPopupMenu();
		
		popupMenu.add(editUndo);
		popupMenu.addSeparator();
		popupMenu.add(editCopy);
		popupMenu.add(editCut);
		popupMenu.add(editPaste);
		popupMenu.add(editSelectAll);		
		
	}
	
	//파일 메뉴 아이템에 대한 getters and setters
	public JMenu getFileMenu() {
		return fileMenu;
	}

	public void setFileMenu(JMenu fileMenu) {
		this.fileMenu = fileMenu;
	}

	public JMenuItem getFileNew() {
		return fileNew;
	}

	public void setFileNew(JMenuItem fileNew) {
		this.fileNew = fileNew;
	}

	public JMenuItem getFileOpen() {
		return fileOpen;
	}

	public void setFileOpen(JMenuItem fileOpen) {
		this.fileOpen = fileOpen;
	}

	public JMenuItem getFileSave() {
		return fileSave;
	}

	public void setFileSave(JMenuItem fileSave) {
		this.fileSave = fileSave;
	}

	public JMenuItem getFileSaveAs() {
		return fileSaveAs;
	}

	public void setFileSaveAs(JMenuItem fileSaveAs) {
		this.fileSaveAs = fileSaveAs;
	}

	public JMenuItem getFilePageSetup() {
		return filePageSetup;
	}

	public void setFilePageSetup(JMenuItem filePageSetup) {
		this.filePageSetup = filePageSetup;
	}

	public JMenuItem getFilePrint() {
		return filePrint;
	}

	public void setFilePrint(JMenuItem filePrint) {
		this.filePrint = filePrint;
	}

	public JMenuItem getFileExit() {
		return fileExit;
	}

	public void setFileExit(JMenuItem fileExit) {
		this.fileExit = fileExit;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 각 메뉴 아이템을 클릭했을 때의 동작 처리 구현
		JMenuItem selectItem = (JMenuItem)e.getSource();
		
		if(selectItem == fileNew)
			JOptionPane.showMessageDialog(parentFrame, "새로만들기 선택");
		if(selectItem == helpAbout){
			JOptionPane.showMessageDialog(parentFrame, "내 메모장 V.1.0");
		}
	}
	
}
