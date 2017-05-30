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
			System.out.println("다음 항목의 값을 입력하시오.");
			System.out.print("상품명 : ");
			goods.setName(br.readLine());
			
			System.out.print("가격 : ");
			goods.setPrice(Integer.parseInt(br.readLine()));
			
			System.out.print("수량 : ");
			goods.setQuantity(Integer.parseInt(br.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		};
		
		System.out.println();
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods);
		System.out.println("총구매 가격 : " + (goods.getPrice() * goods.getQuantity()));
		
	}

}
