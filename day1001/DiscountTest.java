/*���� 1�� : 100��  
 ���� 10�� �̻� ���� 10% ����
 �����Է� -> ��ü���� ��� */
import java.util.Scanner;
class  DiscountTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int qty;
		double tot;
		System.out.print(" �� ���� �����Ͻǰǰ���? :");
		qty = sc.nextInt();
		
		tot = 100.0 * qty;
		System.out.println( "�� ����: " + tot);
		if(qty >= 10){
			tot *= 0.9;
			System.out.println( "10% ���� �� ���� ����: " + tot);
		}
	}
}
