package note.view;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class NoteMenu implements ActionListener {
	// Field
	private JMenuBar menuBar;
	private JPopupMenu popupMenu;
	// �˾��� ���� ������ ������
	private JFrame parentFrame;

	private JMenu fileMenu;
	private JMenu editMenu;
	private JMenu formatMenu;
	private JMenu viewMenu;
	private JMenu helpMenu;

	// ���� �޴�
	private JMenuItem fileNew;
	private JMenuItem fileOpen;
	private JMenuItem fileSave;
	private JMenuItem fileSaveAs;
	private JMenuItem filePageSetup;
	private JMenuItem filePrint;
	private JMenuItem fileExit;

	// ���� �޴�
	private JCheckBoxMenuItem viewStatus;

	// ���� �޴�
	private JMenuItem formatWhiteSpace;
	private JMenuItem formatFont;

	// ���� �޴�
	private JMenuItem helpView;
	private JMenuItem helpAbout;

	// ���� �޴�
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

		// �޴��ٿ� �޴� �߰�
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
	}

	// �˾��޴� ó���� ������ �ʱ�ȭ ������
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
		// ���� �޴� �޴������� ���� �߰�
		fileNew = new JMenuItem("���� �����(N)", KeyEvent.VK_N);
		fileNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		fileNew.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileOpen = new JMenuItem("����(O)...");
		fileOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		fileOpen.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileSave = new JMenuItem("����(S)");
		fileSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileSave.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileSaveAs = new JMenuItem("�ٸ� �̸����� ����(A)...");
		fileSaveAs.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		filePageSetup = new JMenuItem("������ ����(U)...");
		filePageSetup.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		filePrint = new JMenuItem("�μ�(P)...");
		filePrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		filePrint.addActionListener(new FileMenuEventHandler(this, parentFrame));
		
		fileExit = new JMenuItem("������(X)");
		fileExit.addActionListener(new FileMenuEventHandler(this, parentFrame));

		fileMenu = new JMenu("����(F)");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		fileMenu.add(fileNew);
		fileMenu.add(fileOpen);
		fileMenu.add(fileSave);
		fileMenu.add(fileSaveAs);
		fileMenu.addSeparator(); // ���м� �ֱ�
		fileMenu.add(filePageSetup);
		fileMenu.add(filePrint);
		fileMenu.addSeparator();
		fileMenu.add(fileExit);
	}
	
	private void makeEditMenu() {
		// ���� �޴� ������ ����
		editUndo = new JMenuItem("���� ���(U)");
		editUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		editUndo.setEnabled(false);
		editUndo.addActionListener(this);
		
		editCut = new JMenuItem("�߶󳻱�(T)");
		editCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		editCut.setEnabled(false);
		editCut.addActionListener(this);
		
		editCopy = new JMenuItem("����(C)");
		editCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		editCopy.setEnabled(false);
		editCopy.addActionListener(this);
		
		editPaste = new JMenuItem("�ٿ��ֱ�(P)");
		editPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		editPaste.addActionListener(this);
		
		editDelete = new JMenuItem("����(L)");
		editDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		editDelete.addActionListener(this);
		editDelete.setEnabled(false);
		
		editFind = new JMenuItem("ã��(F)...");
		editFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		editFind.addActionListener(this);
		
		editFindNext = new JMenuItem("���� ã��(N)");
		editFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		editFindNext.addActionListener(this);
		
		editReplace = new JMenuItem("�ٲٱ�(R)...");
		editReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		editReplace.addActionListener(this);
		
		editMove = new JMenuItem("�̵�(G)...");
		editMove.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		editMove.addActionListener(this);
		
		editDateTime = new JMenuItem("��¥/�ð�");
		editDateTime.addActionListener(this);
		
		editSelectAll = new JMenuItem("��� ����(A)");
		editSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		editSelectAll.addActionListener(this);

		editMenu = new JMenu("����(E)");
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
		// ���� �޴� ������ ����
		formatWhiteSpace = new JMenuItem("�ڵ� �ٹٲ�(W)");
		formatFont = new JMenuItem("�۲�(F)...");

		formatMenu = new JMenu("����(O)");
		formatMenu.add(formatWhiteSpace);
		formatMenu.add(formatFont);
	}

	private void makeViewMenu() {
		// ���� �޴� ������ ����
		viewStatus = new JCheckBoxMenuItem("����ǥ����(S)", false);

		viewMenu = new JMenu("����(V)");
		viewMenu.add(viewStatus);
	}

	private void makeHelpMenu() {
		// ���� �޴� ������ ����
		helpView = new JMenuItem("���� ����(H)");
		helpView.addActionListener(this);
		helpAbout = new JMenuItem("�� �޸��� ����(A)");
		helpAbout.addActionListener(this);
		
		helpMenu = new JMenu("����(H)");
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
	
	//���� �޴� �����ۿ� ���� getters and setters
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
		// �� �޴� �������� Ŭ������ ���� ���� ó�� ����
		JMenuItem selectItem = (JMenuItem)e.getSource();
		
		if(selectItem == fileNew)
			JOptionPane.showMessageDialog(parentFrame, "���θ���� ����");
		if(selectItem == helpAbout){
			JOptionPane.showMessageDialog(parentFrame, "�� �޸��� V.1.0");
		}
	}
	
}
