import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b;

		System.out.print("첫번째 숫자를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		b = sc.nextInt();

		System.out.print((a > b)?b:a);
	}
}
