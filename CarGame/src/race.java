
import java.awt.EventQueue;
import java.util.Random;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class race extends JFrame {

	// 자동차 게임
	private JLabel background, label1, label2, label3, label4; // 플레이어1~4

	int x1 = 100, x2 = 100, x3 = 100, x4 = 100;
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				Random b = new Random();
				char c = (char) (97 + b.nextInt(25));
				System.out.println(c);
				char a = sc.next().charAt(0);

				if (a == c) {
					x1 += 10;
					System.out.println("한칸 앞으로 이동!");
					label1.setBounds(x1, 0, 100, 100);
					count++;
				}
				if (count == 47) {
					System.out.println("게임이 종료되었습니다.");
					System.out.println(second);
					break;
				}

			} while (true);
		}
	}

	// 포켓몬 레이아웃
	private JLabel label;
	private JTextField selected;
	private JPanel panel;
	private JList list;
	private String[] cities = { "피카츄", "파이리", "꼬부기", "이상해씨" };
	private int gameStart = 0;

	JLabel imgLabel;

	public race() {
		setTitle("포켓몬 레이싱");
		setSize(735, 564);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();

		label = new JLabel("선택한 포켓몬");
		label.setBounds(535, 333, 108, 21);
		selected = new JTextField(10);
		selected.setBounds(620, 331, 82, 24);

		// 텍스트 필드를 편집 불가로 설정한다.
		selected.setEditable(false);
		panel.setLayout(null);
		panel.add(label);
		panel.add(selected);
		getContentPane().add(panel, BorderLayout.CENTER);
		list = new JList(cities);
		list.setBounds(620, 370, 76, 94);
		panel.add(list);
		// 리스트에 경계선을 설정한다.
		list.setBorder(BorderFactory.createLineBorder(Color.black, 1));

		// 리스트의 선택 모드를 단일 선택 모드로 변경
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// 자동차게임
		JPanel panel_1 = new JPanel();

		panel_1.setBounds(37, 15, 561, 258);
		panel_1.setLayout(null);
		background = new JLabel();
		background.setIcon(new ImageIcon("다운로드.gif"));
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("피카츄.gif"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("꼬부기.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("파이리.gif"));
		label4 = new JLabel();
		label4.setIcon(new ImageIcon("이상해씨.gif"));

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

		JButton btnNewButton = new JButton("시작!");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 33));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				(new ComThread()).start();
				(new MyThread()).start();
				
				

			}
		});
		btnNewButton.setBounds(221, 291, 149, 47);

		panel.add(btnNewButton);
		list.addListSelectionListener(new ListListener());
		setVisible(true);

		imgLabel = new JLabel();// 그림 넣을 라벨 생성
		imgLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		imgLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		getContentPane().add(imgLabel, BorderLayout.SOUTH);

	}

	private class ListListener implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {
			// 선택된 도시를 얻는다.
			String selection = (String) list.getSelectedValue();

			// 선택된 도시를 텍스트 필드에 기록한다.
			selected.setText(selection);

			ImageIcon icon = new ImageIcon(selection + ".gif");// 선택된 도시의 이미지 로딩
			label1.setIcon(icon);// 이미지 넣기
			imgLabel.setIcon(icon);
		}
	}

	public static void main(String[] args) {
		race frame = new race();
	}
}