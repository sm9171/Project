package test.udp;

import java.io.IOException;
import java.net.*;
import java.util.*;

public class UDPClient {

	public static void main(String[] args) throws IOException {
	byte[] recieveMessage = new byte[1024];
	
	DatagramSocket ds = new DatagramSocket(5000);
	DatagramPacket dp=new DatagramPacket(recieveMessage,recieveMessage.length);
	ds.receive(dp);
		
	System.out.println("받은 메세지 : " + new String(recieveMessage));
		ds.close();
	}

}
