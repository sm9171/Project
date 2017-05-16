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

			System.out.print("URL페이지 입력 : ");
			String input = br.readLine().trim();
			if (input.equals("none"))
				break;
			URL url = new URL(input);
			System.out.println("프로트콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트명 : " + url.getHost());
			System.out.println("파일경로 : " + url.getFile());
			System.out.println("쿼리스트링 : " + url.getQuery());

			InetAddress[] ips = InetAddress.getAllByName(url.getHost());

			for (int i = 0; i < ips.length; i++) {
				System.out.println(ips[i].getHostAddress());
			}
		}
	}
}
