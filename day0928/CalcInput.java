//연습 사용자한테 두개의 정수를 입력받아 사칙연산을 수행한 결과를 다음과 같이 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

class  CalcInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 수를 입력하시오:");
		int a = sc.nextInt();
		System.out.print("두 번째 수를 입력하시오:");
		int b = sc.nextInt();

		int add = a + b;
		int sub = a - b;
		int multi = a * b;
		int divide = a / b;
		int mode = a % b;
		
		System.out.println("*** 오칙연산 ***");
		System.out.println( a + "+" + b + "= " + add);
		System.out.println( a + "-" + b + "= " + sub);
		System.out.println( a + "*" + b + "= " + multi);
		System.out.println( a + "/" + b + "= " + divide);
		System.out.println( a + "%" + b + "= " + mode);
	}
}
