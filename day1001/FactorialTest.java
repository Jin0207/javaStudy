//사용자한테 n을 입력받아 n!을 구하여 다음과 같이 출력하는 프로그램 작성 
import java.util.Scanner;
class  FactorialTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, result=1;

		System.out.print("n을 입력하세요 : ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){  
			result *= i;
			System.out.print( i + "*");
		}
		System.out.println( "=" + result);
		
	}
}
