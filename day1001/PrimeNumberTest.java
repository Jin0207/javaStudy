// 사용자한테 n을 입력받아서 소수인지 아닌지 판별하는 프로그램을 작성하시오.
import java.util.Scanner;
class  PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, count = 0;

		System.out.print("어떤수가 소수인지 궁금하세요?:");
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
			System.out.println( n + "은 소수입니다.");
		}
		else
		{
			System.out.println( n + "은 소수가 아닙니다.");
		}
	}
}
