package ncs4.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {

		BufferedReader br = null;
		br = new BufferedReader(new InputStreamReader(System.in));
		
		Goods goods = new Goods();
		
		try {
			System.out.println("���� �׸��� ���� �Է��Ͻÿ�.");
			System.out.print("��ǰ�� : ");
			goods.setName(br.readLine());
			
			System.out.print("���� : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
			
			System.out.print("���� : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		};
		
		System.out.println();
		System.out.println("�Էµ� ����� ������ �����ϴ�.");
		System.out.println(goods);
		System.out.println("�ѱ��� ���� : " + (goods.getPrice() * goods.getQuantity()));
		
	}

}
