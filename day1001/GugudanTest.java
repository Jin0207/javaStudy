//������ ������� �Է¹޾� ������ ���
import java.util.Scanner;
class  GugudanTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("������ �� ����� ����ұ��? :");
		n = sc.nextInt();

		for(int i = 1; i < 10; i++){
			System.out.println( n + " *" + i + " = " + i * n);
		}
	}
}