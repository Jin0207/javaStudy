/*���� 1�� : 100��  
 ���� 10�� �̻� ���� 10% ����
 �����Է� -> ��ü���� ��� */
import java.util.Scanner;
class  DiscountTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt, tot;
		System.out.print(" �� ���� �����Ͻǰǰ���? :");
		cnt = sc.nextInt();
		
		tot = price * cnt;
		System.out.println( "�� ����: " + tot);
		if(cnt >= 10){
			tot = (int)(tot * 0.9); //0.9�� double--�Ǽ��̱⶧���� ����� ����ȯ
			System.out.println( "10% ���� �� ���� ����: " + tot);
		}
	}
}
