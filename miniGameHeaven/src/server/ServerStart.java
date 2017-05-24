package server;

import java.net.*;
import java.io.*;
import java.util.*;

public class ServerStart {

	private ServerSocket server;
	private BManager bMan = new BManager();

	int gameOn = 0, gameType = 0;
	private String answer = null;
	long start = 0, end = 0;
	String gameMsg;

	int user, winScore = 0, usercount=0;

	String winnerName;
	String[] users;

	Game_Thread gt = new Game_Thread();
	answerCheck ac = new answerCheck();

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
			ac.start();

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

					if (msg.charAt(0) != '-') {
						if (gameOn == 1) {
							gameMsg = msg;
							ac.check();
						}
					}
					
					if(msg.charAt(0) == '-'){
						String[] tmp = new String[2];
						tmp = msg.replaceAll("-","").split("/");
						tmp[0] = tmp[0].trim();
						tmp[1] = tmp[1].trim();
						users[usercount] = tmp[usercount];
						System.out.println(usercount+" : "+users[usercount]);
						usercount++;
					}

					if (msg != null) {
						bMan.sendToAll(msg);
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

	class Game_Thread extends Thread {
		public Game_Thread() {
		}

		public void run() {
			int gameTerm = 10; // ���� REROAD �ð�
			int gameTime = 60;
			int gameKinds = 3; // ���� ����
			int cnt = 0; // ������ ������ ���

			do {
				try {
					System.out.println("game thread Check : " + cnt);
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
						bMan.sendToAll("�� �ͼ��� ����.<br>" + str[0]);
						answer = str[1].trim();
						gameOn = 1;
						gameType = 0;
						gameTime = 15;
						cnt = 0;
						break;
					case 1: // Ÿ�� ���� ����
						String str1 = new game.TypingGame().start();
						bMan.sendToAll("�� Ÿ�� ���� ���� !! �Ʒ� ���� �Է��ϼ���.<br>" + str1);
						start = System.currentTimeMillis();
						answer = str1.trim();
						gameOn = 1;
						gameType = 1;
						gameTime = 45;
						cnt = 0;
						break;
					case 2: // ���̽��� ����
						String str2 = new game.BaseBallGame().start();
						answer = str2.trim();
						bMan.sendToAll("�� ���̽��� ����. �ߺ����� �ʴ� 4�ڸ� ���ڸ� �Է� �ϼ���.");
						gameOn = 1;
						gameType = 2;
						gameTime = 45;
						cnt = 0;
						break;
					case 3: // ȭ��ǥ ����
						gameType = 3;
//						bMan.sendToAll("3");
						gameOn = 1;
						gameTime = 20;
						cnt = 0;
						break;
					case 4: // �δ��� ����
						gameType = 4;
						bMan.sendToAll("4");
						gameOn = 1;
						gameTime = 16;
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
					if (cnt == gameTime) {
						if (gameType == 3 || gameType == 4) {
							gameOn = 0;
							try {
								bMan.sendToAll("====================== ���ڴ�" + winnerName + "�Դϴ�. ======================");
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						} else {
							gameOn = 0;
							try {
								bMan.sendToAll("�� ������ ���׿�. ���� ������ �غ� �� �Դϴ�.");
								Thread.sleep(2000);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						cnt = 0;
					}
				}
			} while (true);
		}

	}

	// ���� üũ
	class answerCheck extends Thread {
		public void run() {
		}

		public void check() {
			System.out.println(gameMsg);
			if (gameMsg != null) {
				System.out.println("test AC ");
				String[] str = new String[2];

				if (gameMsg.charAt(0) == '@') {
					str = gameMsg.replaceAll("@", "").split(":");
					str[0] = str[0].trim();
					str[1] = str[1].trim();
					
					System.out.println(str[0]);
					System.out.println(str[1]);

					if (Integer.parseInt(str[1]) > winScore) {
						winnerName = str[0];
					} else if (Integer.parseInt(str[1]) == winScore) {
						winnerName += (", " + str[0]);
					}
					
					System.out.println(winScore);
					System.out.println(winnerName);
					
				}
				else {
					str = gameMsg.split(":");
					str[0] = str[0].trim();
					str[1] = str[1].trim();

					System.out.println(answer);
					System.out.println(str[0]);
					System.out.println(str[1]);

					if (str[1].equals(answer)) {
						gameOn = 0;
						end = System.currentTimeMillis();
						bMan.sendToAll("====================== " + str[0] + "�� �����Դϴ�!!! ======================");
						if (gameType == 1)
							bMan.sendToAll("��� �ð� : " + (end - start) / 1000 + "�� " + (end - start) % 1000);
						bMan.sendToAll("�� ���� ������ �غ� �մϴ�.");
					} else if (gameType == 2) {
						if (answer.length() == str[1].length())
							bMan.sendToAll(new game.BaseBallGame().countSB(answer, str[1]));
					}
				}
				gameMsg = null;
			}
		}
	}

	// ���� ������ ����
	class BManager extends Vector {
		String name;

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
			String info = "���� ä�� �ο�  : " + size(); // + sock.toString();
			user=size();
			users = new String[user];
			sendToAll(info);
			usercount=0;
			bMan.sendToAll("/"); // �̰� �� ���� ������ ��.
		}
	}
}