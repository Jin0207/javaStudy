//��������� n�� �Է¹޾� n!�� ���Ͽ� ������ ���� ����ϴ� ���α׷� �ۼ� 
import java.util.Scanner;
class  FactorialTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, result=1;

		System.out.print("n�� �Է��ϼ��� : ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){  
			result *= i;
			System.out.print( i + "*");
		}
		System.out.println( "=" + result);
		
	}
}