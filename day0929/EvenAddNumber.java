import java.util.Scanner;
class  ConditionalEvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String result;
		
		System.out.print("임의의 수를 입력하세요");
		n = sc.nextInt();
		result = ((n % 2 ==0)? "짝수": "홀수");
		System.out.println(n + "은" + result + "입니다");
	}
}
