package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String[] Goods = new String[COUNT_GOODS]; 
		
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		System.out.println("입력하세요");
		for(int i=0; i < goods.length; i++) {
			Goods[i] = scanner.next();
		}


		// 상품 출
		System.out.println(goods);
		
		// 자원정리
		scanner.close();
	}
}
