// ��������� n�� �Է¹޾Ƽ� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;
class  PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, count = 0;

		System.out.print("����� �Ҽ����� �ñ��ϼ���?:");
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++)
		{
			if(n % i == 0)
			{
				count++;
			}	
		}

		if(count == 2)
		{
			System.out.println( n + "�� �Ҽ��Դϴ�.");
		}
		else
		{
			System.out.println( n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}