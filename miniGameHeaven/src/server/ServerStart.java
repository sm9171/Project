package server;

import java.net.*;
import java.io.*;
import java.util.*;

import game.NonsenseQuiz;

public class ServerStart {

	private ServerSocket server;
	private BManager bMan = new BManager();

	int gameOn = 0;
	int gameType = 0;
	private String question = null;
	private String answer = null;
	Game_Thread gt = new Game_Thread();
	long start = 0, end = 0;
	String[] userName = new String[30];
	String[] tmp = new String[2];
	int cnt = 0;

	public ServerStart() {
	}

	// ����
	public static void main(String[] args) {
		ServerStart server = new ServerStart();
		server.startServer();
	}

	// ����
	void startServer() {
		try {
			server = new ServerSocket(7777);
			System.out.println("���������� �����Ǿ����ϴ�.");
			gt.start();

			while (true) {
				Socket socket = server.accept();
				new Chat_Thread(socket).start();
				bMan.add(socket);
				bMan.sendClientInfo(socket);
				System.out.println(bMan);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// Ŭ���̾�Ʈ�� ����ϴ� ������ Ŭ����. (���� ���� ����. ��ȭ ����.)
	class Chat_Thread extends Thread {
		Socket socket;
		private BufferedReader reader;
		private PrintWriter writer;

		public Chat_Thread(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				writer = new PrintWriter(socket.getOutputStream(), true);
				String msg;
				while ((msg = reader.readLine()) != null) {
					System.out.println(msg);

					if (msg.charAt(0) == '/') {
						tmp = msg.split("/");
						userName[cnt] = tmp[1].trim();
						cnt++;
						System.out.println("�̰ͺ���." + cnt);
					}

					bMan.sendToAll(msg);
					if (gameOn == 1) {
						answerCheck(msg);
					}
				}
			} catch (Exception e) {
			} finally {
				try {
					bMan.remove(socket);

					if (reader != null)
						reader.close();
					if (writer != null)
						writer.close();
					if (socket != null)
						socket.close();
					reader = null;
					writer = null;
					socket = null;
					System.out.println("Ŭ���̾�Ʈ�� �������ϴ�.");
					bMan.sendClientInfo(socket);
				} catch (Exception e) {
				}
			}
		}
	}

	// ���� ������. �������� ���� �߻�.
	class Game_Thread extends Thread {
		public Game_Thread() {
		}

		public void run() {
			int gameTerm = 20; // ���� REROAD �ð�
			int gameKinds = 3; // ���� ����
			int cnt = 0; // ������ ������ ���

			do {
				try {
					System.out.println("while Check " + cnt);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (gameOn == 0) {
					for (int i = gameTerm; i >= 0;) {
						System.out.println(i);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}

						if (i < 6)
							bMan.sendToAll("�� ����" + i + "����");
						else if (i < 17)
							bMan.sendToAll("�� �� ������ ���� �˴ϴ�.");

						i--;
					}

					int num = (int) (Math.random() * gameKinds);
					System.out.println("���� Ÿ��" + num);

					switch (num) {
					
					case 0: // ���� ����
						String[] str = new game.NonsenseQuiz().start();
						bMan.sendToAll("��" + str[0]);
						answer = str[1].trim();
						gameOn = 1;
						gameType = 0;
						cnt = 0;
						break;
						
					case 1: // Ÿ�� ���� ����
						String str1 = new game.TypingGame().start();
						bMan.sendToAll("��" + str1);
						start = System.currentTimeMillis();
						answer = str1.trim();
						gameOn = 1;
						gameType = 1;
						cnt = 0;
						break;
						
					case 2: // ���̽��� ����
						String str2 = new game.BaseBallGame().start();
						answer = str2.trim();
						bMan.sendToAll("�� ���̽��� ����. �ߺ����� �ʴ� 4�ڸ� ���ڸ� �Է� �ϼ���.");
						gameOn = 1;
						gameType = 2;
						cnt = 0;
						break;
					case 3: // ȭ��ǥ ����
						gameType = 3;
						cnt = 0;
						break;
					case 4: // ���̽� ����
						gameType = 4;
						cnt = 0;
						break;
					}

				} else {
					try {
						Thread.sleep(1000);
						cnt++;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if (cnt == 60) {
						gameOn = 0;
						try {
							bMan.sendToAll("�� ������ ���׿�. ���� ������ �غ� �� �Դϴ�.");
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						cnt = 0;
					}
				}
			} while (true);
		}
	}

	// ���� üũ
	private void answerCheck(String msg) {
		String[] str = new String[2];
		str = msg.split(":");
		str[0] = str[0].trim();
		str[1] = str[1].trim();

		System.out.println(answer);
		System.out.println(str[0]);
		System.out.println(str[1]);

		if (str[1].equals(answer)) {
			gameOn = 0;
			end = System.currentTimeMillis();
			bMan.sendToAll("-------------------- " + str[0] + "�� �����Դϴ�!!! --------------------");
			if (gameType == 1)
				bMan.sendToAll("��� �ð� : " + (end - start) / 1000 + "�� " + (end - start) % 1000);
			start = 0;
			bMan.sendToAll("�� ���� ������ �غ� �մϴ�.");
		} else if (gameType == 2) {
			bMan.sendToAll(new game.BaseBallGame().countSB(answer, str[1])); // ����
																				// üũ
																				// ��Ʈ����ũ
																				// ��
																				// üũ.
		}
	}

	// ���� ������ ����
	class BManager extends Vector {

		BManager() {
		}

		void add(Socket sock) {
			super.add(sock);
		}

		void remove(Socket sock) {
			super.remove(sock);
		}

		synchronized void sendToAll(String msg) {
			PrintWriter writer = null;
			Socket sock;

			for (int i = 0; i < size(); i++) {
				sock = (Socket) elementAt(i);

				try {
					writer = new PrintWriter(sock.getOutputStream(), true);
				} catch (IOException ie) {
				}

				if (writer != null)
					writer.println(msg);
			}
		}

		synchronized void sendClientInfo(Socket sock) {
			// userInfo();
			String info = "���� ä�� �ο�  : " + size(); // + sock.toString();
			System.out.println(info);
			sendToAll(info);
			userInfo();
		}

		public void userInfo() {
			String userInfo = "======= �����ο� =======\n";
			for (int i = 0; i < size(); i++) {
				userInfo += userName[i] + "\n";
			}
			System.out.println("���ͺ���"+size());
			bMan.sendToAll(userInfo);
		}

	}

}