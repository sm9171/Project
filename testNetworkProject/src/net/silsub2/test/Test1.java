package net.silsub2.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.print("호스트명 : ");
			String input = sc.nextLine();

			if (input.equals("none") != true) {
				InetAddress[] ips = InetAddress.getAllByName(input);
				System.out.println(ips[0].getHostName());
							
				for (InetAddress ip : ips)
					System.out.println(ip.getHostAddress());
			}else break;
		}while(true); 		

	}

}
