import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, min;

		System.out.print("첫번째 숫자를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요: ");
		b = sc.nextInt();
		min =(a < b)?a:b;

		System.out.print("작은수는 " + min + "입니다.");
	}
}
