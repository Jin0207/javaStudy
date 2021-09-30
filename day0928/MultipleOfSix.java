//연습 사용자한테 임의의 수 n을 입력받아 그 수가 6의 배수인지 판별하여 논리값을 출력하시오
import java.util.Scanner;

class MultipleOfSix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("값을 입력하면 6의 배수인지 알려드립니다.");
		int n = sc.nextInt();
		boolean result = n % 6 == 0;

		System.out.println(result);
	}
}
