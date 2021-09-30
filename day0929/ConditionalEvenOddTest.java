import java.util.Scanner;
class  ConditionalEvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = 0;
		String result;
		
		System.out.print("숫자를 입력하세요");
		N = sc.nextInt();
		result = (N % 2 ==0? "짝수": "홀수");
		System.out.println(result);
	}
}
