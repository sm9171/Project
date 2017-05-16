package udp.practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPSpamReciever {

	public static void main(String[] args) {
		// 무한루프로 전송 온 패킷 정보를 계속 받아 출력하는 클라이언트 클래스
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
