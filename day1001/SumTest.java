//사용자한테 1부터 어떤 수까지 더하기 하여 누적할 것인지 입력받아 1부터 입력한 수까지 합을 누적하여 출력하는 프로그램
import java.util.Scanner;
class  SumTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0;

		System.out.print("1부터 어떤 수까지 더할까요? :");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
