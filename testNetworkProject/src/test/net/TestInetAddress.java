package test.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {

	public static void main(String[] args) {
		// InetAddress test
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� ���� ip ���� : " + ips.length);
			
			for (int i=0; i<ips.length; i++){
				System.out.println(ips[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}

	}

}
