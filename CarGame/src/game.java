import java.awt.EventQueue;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.*;


import java.awt.*;

public class game extends JFrame {

	// �ڵ��� ����
	private JLabel label1, label2, label3,label4;	//�÷��̾�1~4
	int x1 = 100, x2 = 100, x3 = 100, x4 = 100;

	class MyThread extends Thread {
		Scanner sc = new Scanner(System.in);

		public void run() {
			int count = 0;
	

			do {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				Random b = new Random();
				char c = (char) (97 + b.nextInt(25));
				System.out.println(c);
				char a = sc.nextLine().charAt(0);
				if (a == c) {
					x1 += 50;
					System.out.println("��ĭ ������ �̵�!");
					label1.setBounds(x1, 0, 100, 100);
					count++;
				}
				
				if (count == 10) {
					System.out.println("�¸��Ͽ����ϴ�!!");
					break;
				}

			} while (true);
		}
	}

	// ���ϸ� ���̾ƿ�
	private JLabel label;
	private JTextField selected;
	private JPanel panel;
	private JList list;
	private String[] cities = { "��ī��", "���̸�", "���α�", "�̻��ؾ�" };

	JLabel imgLabel;

	public game() {
		setTitle("���ϸ� ���̽�");
		setSize(735, 564);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		label = new JLabel("������ ���ϸ�");
		label.setBounds(535, 333, 108, 21);
		selected = new JTextField(10);
		selected.setBounds(620, 331, 82, 24);

		// �ؽ�Ʈ �ʵ带 ���� �Ұ��� �����Ѵ�.
		selected.setEditable(false);
		panel.setLayout(null);
		panel.add(label);
		panel.add(selected);
		getContentPane().add(panel, BorderLayout.CENTER);
		list = new JList(cities);
		list.setBounds(620, 370, 76, 94);
		panel.add(list);
		// ����Ʈ�� ��輱�� �����Ѵ�.
		list.setBorder(BorderFactory.createLineBorder(Color.black, 1));

		// ����Ʈ�� ���� ��带 ���� ���� ���� ����
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// �ڵ�������
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
	
	
		panel_1.setBounds(37, 15, 561, 258);
		panel_1.setLayout(null);
				
		
		label1 = new JLabel();
		label1.setIcon(new ImageIcon());
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("���α�.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("��ī��.gif"));
		label4 = new JLabel();
		label4.setIcon(new ImageIcon("�̻��ؾ�.gif"));
		panel_1.add(label1);
		panel_1.add(label2);
		panel_1.add(label3);
		panel_1.add(label4);
		label1.setBounds(100, 0, 100, 100);
		label2.setBounds(100, 50, 100, 100);
		label3.setBounds(100, 100, 100, 100);
		label4.setBounds(100, 150, 100, 100);
		(new MyThread()).start();
		panel.add(panel_1);
		list.addListSelectionListener(new ListListener());
		setVisible(true);

		imgLabel = new JLabel();// �׸� ���� �� ����
		imgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		imgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		getContentPane().add(imgLabel, BorderLayout.SOUTH);

	}

	private class ListListener implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {
			// ���õ� ���ø� ��´�.
			String selection = (String) list.getSelectedValue();

			// ���õ� ���ø� �ؽ�Ʈ �ʵ忡 ����Ѵ�.
			selected.setText(selection);

			ImageIcon icon = new ImageIcon(selection + ".gif");// ���õ� ������ �̹��� �ε�
			label1.setIcon(icon);// �̹��� �ֱ�
			imgLabel.setIcon(icon);
		}
	}

	public static void main(String[] args) {
		game frame = new game();
	}
}
