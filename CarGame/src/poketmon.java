
import java.awt.EventQueue;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class poketmon extends JFrame {

	// �ڵ��� ����
	private JLabel background, label1, label2, label3, label4; // �÷��̾�1~4
	private int x1 = 100, x2 = 100, x3 = 100, x4 = 100;
	private JLabel textArea;
	double second = 0;
	


	
	class ComThread extends Thread {
		public void run() {
			do {
				try {
					Thread.sleep(500);
					second += 0.5;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x2 += (int) (Math.random() * 10);
				label2.setBounds(x2, 50, 100, 100);
				x3 += (int) (Math.random() * 10);
				label3.setBounds(x3, 100, 100, 100);
				x4 += (int) (Math.random() * 10);
				label4.setBounds(x4, 150, 100, 100);
			} while (true);
		}
	}
	


	class MyThread extends Thread {
		Scanner sc = new Scanner(System.in);

		
		public void run() {
			int count = 0;

			do {
				Random b = new Random();
				char c = (char) (97 + b.nextInt(25));
				System.out.println(c);
				char a = sc.next().charAt(0);
				textArea.setText(c+"");
				
				String result="";
				if (a == c) {
					x1 += 10;
					result="��ĭ ������ �̵�!";
					System.out.println(result);
					label1.setBounds(x1, 0, 100, 100);
					count++;
				}
				if (count == 47) {
					result="������ ����Ǿ����ϴ�.";
					System.out.println(result);
					System.out.println(second);
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
	private int gameStart = 0;

	JLabel imgLabel;
	private JTextField textField;

	public poketmon() {
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

		panel_1.setBounds(37, 15, 561, 258);
		panel_1.setLayout(null);
		background = new JLabel();
		background.setIcon(new ImageIcon("�ٿ�ε�.gif"));
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("��ī��.gif"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("���α�.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("���̸�.gif"));
		label4 = new JLabel();
		label4.setIcon(new ImageIcon("�̻��ؾ�.gif"));

		panel_1.add(label1);
		panel_1.add(label2);
		panel_1.add(label3);
		panel_1.add(label4);
		panel_1.add(background);
		background.setBounds(0, 0, 561, 258);
		label1.setBounds(100, 0, 100, 100);
		label2.setBounds(100, 50, 100, 100);
		label3.setBounds(100, 100, 100, 100);
		label4.setBounds(100, 150, 100, 100);
	
		panel.add(panel_1);

		JButton btnNewButton = new JButton("����!");
		btnNewButton.setFont(new Font("����", Font.BOLD, 33));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new ComThread()).start();
				(new MyThread()).start();
				
				

			}
		});
		btnNewButton.setBounds(37, 307, 149, 47);

		panel.add(btnNewButton);
		
		textArea = new JLabel();
		textArea.setBounds(37, 368, 561, 78);
		panel.add(textArea);
		
		
		
		textField = new JTextField();
		textField.setBounds(80, 456, 519, 21);
		panel.add(textField);
		textField.setColumns(10);
	
	

		
		JLabel label_1 = new JLabel("�Է�â");
		label_1.setBounds(37, 459, 57, 15);
		panel.add(label_1);
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
		poketmon frame = new poketmon();
	}
}