//구매수량이 10개 이상이거나 구매금액이 2만원 이상이면 구매금액의 10% 할인하려고한다.

import java.util.Scanner;
class  DiscountTenPercent //최종적으로 지불액을 출력하니깐 PaymentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String product;
		int price, amount, total;

		System.out.print(" 구매하실 상품명을 입력해주세요: ");
		product = sc.next();
		System.out.print(" 구매하실 상품의 가격을 입력해주세요: ");
		price = sc.nextInt();
		System.out.print(" 구매하실 상품의 수량을 입력해주세요: ");
		amount = sc.nextInt();
		total = price * amount;
		
		System.out.println("****결과 출력 ****");
		System.out.println("상품명: " + product);
		System.out.println("단가: " + price);
		System.out.println("수량: " + amount);
		System.out.println("총금액: " + total);

		if(total >= 20000 || amount >= 10)
			System.out.println("10% 할인 받아 지불하실 금액: " + (total * 0.9));

	}
}
