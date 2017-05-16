package test.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("메세지 입력 : ");
		String message=sc.nextLine();
		int port=5555;
		DatagramSocket ds=new DatagramSocket(port);
		InetAddress ia=InetAddress.getByName("client ip 주소");
		byte a[] =message.getBytes();

		DatagramPacket dp=new DatagramPacket(a,0,a.length,ia,port);
		ds.send(dp);
		ds.close();
	}



}
