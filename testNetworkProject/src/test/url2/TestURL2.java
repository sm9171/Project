package test.url2;

import java.io.*;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class TestURL2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {

			System.out.print("URL������ �Է� : ");
			String input = br.readLine().trim();
			if (input.equals("none"))
				break;
			URL url = new URL(input);
			System.out.println("����Ʈ�� : " + url.getProtocol());
			System.out.println("��Ʈ��ȣ : " + url.getPort());
			System.out.println("ȣ��Ʈ�� : " + url.getHost());
			System.out.println("���ϰ�� : " + url.getFile());
			System.out.println("������Ʈ�� : " + url.getQuery());

			InetAddress[] ips = InetAddress.getAllByName(url.getHost());

			for (int i = 0; i < ips.length; i++) {
				System.out.println(ips[i].getHostAddress());
			}
		}
	}
}
