package udp.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPSpamReciever {

	public static void main(String[] args) {
		// ���ѷ����� ���� �� ��Ŷ ������ ��� �޾� ����ϴ� Ŭ���̾�Ʈ Ŭ����
		do {
			
			byte[] recieveMessage = new byte[1024];

			DatagramSocket ds;
			try {
				ds = new DatagramSocket(4000);
				DatagramPacket dp = new DatagramPacket(recieveMessage, recieveMessage.length);
				ds.receive(dp);
				System.out.println(new String(recieveMessage));
				ds.close();
			} catch (SocketException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} while (true);
	}
}
