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

		// �޴��� �߰���
		this.setJMenuBar(new NoteMenu(this).getMenuBar());

		// ���� �Է� ������Ʈ �߰�
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

	// ����(Nested or Inner) Ŭ���� : Ŭ���� �ȿ��� �ۼ��ϴ� Ŭ����
	// ���� Ŭ������ �ܺ�(Outer) Ŭ������ ��� ������ ��
	// �׷��Ƿ� �޼ҵ峪 �ʵ�ó�� ���������� 4���� ��� ��� ������
	// ���� Ŭ������ ����� ������ �ǹǷ� static �� ��� ������
	// �����ϵǸ� �ܺ�Ŭ������$����Ŭ������.class

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
