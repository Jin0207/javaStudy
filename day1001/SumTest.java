//��������� 1���� � ������ ���ϱ� �Ͽ� ������ ������ �Է¹޾� 1���� �Է��� ������ ���� �����Ͽ� ����ϴ� ���α׷�
import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0;

		System.out.print("1���� � ������ ���ұ��? :");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			sum += i;
		}

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
