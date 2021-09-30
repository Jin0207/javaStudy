//연습 사용자한테 두개의 정수를 입력받아 그 중에 작은 수를 찾아서 출력하는 프로그램을 작성하시오
import java.util.Scanner;

class  Min
{
	public static void main(String[] args) 
	{
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력하세요:);
		a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력하세요:);
		b = sc.nextInt();

		if(a > b)
			System.out.println(b);
		else
			System.out.println(a);
	}
}
