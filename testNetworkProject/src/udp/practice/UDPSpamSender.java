package udp.practice;

import java.io.IOException;
import java.net.*;
import java.util.Random;
import java.util.Scanner;

public class UDPSpamSender {

	public static void main(String[] args) {
		// 무작위로 10개의 ip에 스팸 메세지 전송하는 서버 클래스

		String ip = null;
		for (int i = 0; i < 10; i++)
			ip = "192.168.20." + (new Random().nextInt(40) + 34);
		String spam;

		try {
			spam = InetAddress.getLocalHost().getHostName() + "gg";

			byte[] spamMessage = spam.getBytes();
			DatagramSocket ds = new DatagramSocket(4000);
			DatagramPacket dp = null;
			dp = new DatagramPacket(spamMessage, spamMessage.length, InetAddress.getByName(ip), 4000);

			ds.receive(dp);
			ds.close();

		} catch (UnknownHostException e) {

			e.printStackTrace();
		} catch (SocketException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
