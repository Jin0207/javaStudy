//���� ��������� ������ �� n�� �Է¹޾� �� ���� 6�� ������� �Ǻ��Ͽ� ������ ����Ͻÿ�
import java.util.Scanner;

class MultipleOfSix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϸ� 6�� ������� �˷��帳�ϴ�.");
		int n = sc.nextInt();
		boolean result = n % 6 == 0;

		System.out.println(result);
	}
}
