//비트곱연산자를 사용해서 두사람의 나이를 입력받아 두 사람 모두 20살이상인지 판별하여 적합한 메세지를 출력하는 프로그램
import java.util.Scanner;

class  BitLogical
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1, age2;

		System.out.print("나이를 입력해주세요: ");
		age1 = sc.nextInt();
		System.out.print("나이를 입력해주세요: ");
		age2 = sc.nextInt();

		if(age1 >= 20 & age2 >= 20)
			System.out.println("두 사람 모두 20살 이상입니다.");
		else
			System.out.println("두사람 모두 20살 이상은 아닙니다.");
	}
}
