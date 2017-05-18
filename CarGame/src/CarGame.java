import java.util.Random;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	// �ʺ�
	private JLabel label1, label2,label3;
	int x1 = 100, x2 = 100, x3 = 100;

	class MyThread extends Thread {
		Scanner sc = new Scanner(System.in);

		public void run() {
			int count= 0;
			int card=0;
		
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
				} else {
					label1.setBounds(x1, 0, 100, 100);
					card++;
				}
				if (count == 10) {
					System.out.println("�¸��Ͽ����ϴ�!!");
					break;
				}
				if(card==1){
					System.out.println("Ʋ�� ���ڸ� �Է� �Ͽ����ϴ� ----- ���!");
				}else if(card==2){
					System.out.println("Ʋ�� ���ڸ� �Է� �Ͽ����ϴ� ----- ���ο� ī��!");
				}else if(card==3){
					System.out.println("Ʋ�� ���ڸ� �Է� �Ͽ����ϴ� ----- ����ī��!");
					System.out.println("������ ����Ǿ����ϴ�.");
					break;
				}
				
			} while (true);
		}
	}

	public CarGame() {
		setTitle("CarRace");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		label1 = new JLabel();
		label1.setIcon(new ImageIcon("���̸�.gif"));
		label2 = new JLabel();
		label2.setIcon(new ImageIcon("���α�.gif"));
		label3 = new JLabel();
		label3.setIcon(new ImageIcon("��ī��.gif"));
		add(label1);
		add(label2);
		add(label3);
		label1.setBounds(100, 0, 100, 100);
		label2.setBounds(100, 50, 100, 100);
		label3.setBounds(100, 100, 100, 100);
		(new MyThread()).start();
		setVisible(true);
	}

	public static void main(String[] args) {
		CarGame t = new CarGame();
	}
}
