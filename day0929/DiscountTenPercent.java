//���ż����� 10�� �̻��̰ų� ���űݾ��� 2���� �̻��̸� ���űݾ��� 10% �����Ϸ����Ѵ�.

import java.util.Scanner;
class  DiscountTenPercent //���������� ���Ҿ��� ����ϴϱ� PaymentTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String product;
		int price, amount, total;

		System.out.print(" �����Ͻ� ��ǰ���� �Է����ּ���: ");
		product = sc.next();
		System.out.print(" �����Ͻ� ��ǰ�� ������ �Է����ּ���: ");
		price = sc.nextInt();
		System.out.print(" �����Ͻ� ��ǰ�� ������ �Է����ּ���: ");
		amount = sc.nextInt();
		total = price * amount;
		
		System.out.println("****��� ��� ****");
		System.out.println("��ǰ��: " + product);
		System.out.println("�ܰ�: " + price);
		System.out.println("����: " + amount);
		System.out.println("�ѱݾ�: " + total);

		if(total >= 20000 || amount >= 10)
			System.out.println("10% ���� �޾� �����Ͻ� �ݾ�: " + (total * 0.9));

	}
}
