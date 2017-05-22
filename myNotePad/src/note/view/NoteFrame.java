package note.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class NoteFrame extends JFrame {
	// Field
	private JTextArea textPane;

	public NoteFrame() {
		super("MyNotePad");
		this.setBounds(new Rectangle(100, 100, 800, 500));

		// 메뉴바 추가함
		this.setJMenuBar(new NoteMenu(this).getMenuBar());

		// 글자 입력 컴포넌트 추가
		textPane = new JTextArea();
		textPane.addKeyListener(new KeyHandler());
		textPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				showPopup(e);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				showPopup(e);
			}

			private void showPopup(MouseEvent e) {
				if (e.isPopupTrigger()) {
					new NoteMenu().getPopupMenu().show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		
		JScrollPane scrollPane = new JScrollPane(textPane);
		this.add(scrollPane, BorderLayout.CENTER);

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);
	}

	public JTextArea getTextPane() {
		return textPane;
	}

	public void setTextPane(JTextArea textPane) {
		this.textPane = textPane;
	}

	// 내부(Nested or Inner) 클래스 : 클래스 안에서 작성하는 클래스
	// 내부 클래스는 외부(Outer) 클래스의 멤버 개념이 됨
	// 그러므로 메소드나 필드처럼 접근제한자 4가지 모두 사용 가능함
	// 내부 클래스는 멤버의 개념이 되므로 static 도 사용 가능함
	// 컴파일되면 외부클래스명$내부클래스명.class

	private class KeyHandler implements KeyListener {

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

	}
}
