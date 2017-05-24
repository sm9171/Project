package client;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import java.io.*;

public class mainFrame extends JFrame implements Runnable {
	private String name;

	// GUI�� ����
	private JLabel nameBox;
	private JTextField sendBox;
	private JTextArea msgView, userList;
	private JButton send;
	private JPanel north, south, west, center;
	private JScrollPane scroll;

	// ��ſ� ����
	private BufferedReader reader;
	private PrintWriter writer;
	private Socket socket;

	private int gameOn = 0;

	public mainFrame(String title, String name) {
		super(title);

		this.setTitle("�̴ϰ��� õ��");
		this.name = name;
		this.setBounds(new Rectangle(100, 100, 890, 530));
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		nameBox = new JLabel("<html><br>" + name + "�� ȯ���ؿ�.<br><br><br></html>");
		north = new JPanel();
		north.add(nameBox);

		this.add(north, BorderLayout.NORTH);
		// -------------------------------------------------------------- ���� ��

		sendBox = new JTextField(50);
		send = new JButton("�� ��");

		south = new JPanel();
		south.add(new JLabel("����â : "));
		south.add(sendBox);
		south.add(send);

		this.add(south, BorderLayout.SOUTH);

		// --------------------------------------------------------------- ���� ��

		msgView = new JTextArea(19, 60);
		msgView.setEditable(false);
		scroll = new JScrollPane(msgView);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		center = new JPanel();
		center.add(new JLabel("- ä �� ȭ �� -"));
		center.add(scroll);

		this.add(center, BorderLayout.CENTER);

		// --------------------------------------------------------------- ���

		userList = new JTextArea(19, 15);

		west = new JPanel();
		west.add(new JLabel("- ������ -"));
		west.add(userList);
		west.setPreferredSize(new Dimension(180, 400));
		this.add(west, BorderLayout.WEST);

		// -----------------------------------------------------------------------

		// sendBox �׼� �̺�Ʈ ó��
		sendBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					writer.println(name + " : " + sendBox.getText()); // �������
					if (gameOn == 1) {

					}
					sendBox.setText(""); // sendBox�� ������ �����.

				} catch (Exception ie) {
				}
			}
		});

		send.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				try {
					writer.println(name + " : " + sendBox.getText()); // �������
					sendBox.setText(""); // sendBox�� ������ �����.
				} catch (Exception ie) {
				}
			}
		});
		// pack();
	}

	public void run() {
		// writer.println(name + socket.getInetAddress());
		while (true) {
			try {
				String str = reader.readLine();
				if (str != null) {
					if (str.charAt(0) == '��') {						//���� â. ��ɾ�
						if (str.contains("<br>"))
							nameBox.setText("<html><center><br>" + str.replaceAll("��", "") + "<br><center></html>");
						else
							nameBox.setText("<html><center><br>" + str.replaceAll("��", "") + "<br><br><center></html>");
					} 
					
					
					else if (str.charAt(0) == '/')					//��������Ʈ ���� ���� ��ɾ�.
						writer.println("-" + name + socket.getInetAddress());
					else if (str.charAt(0) == '��')					//���� ����Ʈ ���� ��ɾ�
						userList.setText(str + "\n");
					else if (str.charAt(0) == '-')					//���� ����Ʈ �Է� ��ɾ�
						userList.append(str + "\n");

					
					else if (str.charAt(0) == '@')					//���� ���� ��� ��ɾ�
						;
					else if (str.equals("3")) {						//Ŭ���� ��Ʈ �� ���� ���� ��ɾ�
						nameBox.setText("<html><center><br>����� ���̷�Ʈ<br><br><center></html>");
						new MemoryGame();
					} else if (str.equals("4")) {
						nameBox.setText("<html><center><br>�δ��� ����!!!<br><br><center></html>");
						new MoleGame(writer, name);
					} else
						msgView.append(str + "\n");
				}
			} catch (IOException ie) {
			}
		}
	}

	public void numberGame() {
		MemoryGame ng = new MemoryGame();
		int count = 4;
		String[] howTo = ng.howTo();
		String question;
		for (int i = 0; i < howTo.length; i++) {
			try {
				nameBox.setText("<html><center><br>" + howTo[i] + "<br></center></html>");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		while (true) {
			question = ng.question(count);
			System.out.println(question);
			String[] direct = question.replaceAll("null", "").split(" ");

			try {
				nameBox.setText("<html><center><br>" + count + "�ܰ� ����.<br></center></html>");
				Thread.sleep(2000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}

			for (int j = 0; j < count; j++) {
				nameBox.setText("<html><center><br>" + direct[j] + "<br></center></html>");
				try {
					Thread.sleep(1000);
					nameBox.setText("<html><center><br> <br></center></html>");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			nameBox.setText("<html><center><br>�Է��ϼ���!" + "<br></center></html>");

			if (ng.answerCheck(sendBox.getText()))
				count++;
			else
				break;
		}
		writer.println("3" + name + count);
	}

	public void connect() {
		try {
			msgView.append("�������ϰ��� ������ �õ��մϴ�.\n");
			socket = new Socket("127.0.0.1", 7777);
			msgView.append("ä�� �غ� �Ϸ�Ǿ����ϴ�.\n");
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			writer = new PrintWriter(socket.getOutputStream(), true);

			new Thread(this).start();
		} catch (Exception e) {
			msgView.append("���� ����..");
		}
	}
}