package test.url;

import java.net.*;

public class TestURL {

	public static void main(String[] args) throws MalformedURLException {
		// URL Test
		URL url = new URL("http://newsstand.naver.com/?list=ct1&pcode=214");
		System.out.println("�������� : "+url.getProtocol());
		System.out.println("��Ʈ��ȣ : "+url.getPort());
		System.out.println("ȣ��Ʈ�� : "+url.getHost());
		System.out.println("���ϰ�� : " +url.getFile());
		System.out.println("��ü��� : "+ url.toExternalForm());
		System.out.println("������Ʈ�� : "+url.getQuery());
	}

}
