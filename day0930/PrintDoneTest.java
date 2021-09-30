// 사용자한테 임의의 수 n을 입력받아 N이 양수이면 그 수에 100을 더한 값을 출력한 다음 "작업종료"를 출력하고
// 그렇지 않으면 그 수의 제곱을 출력한다음 "작업종료"를 출력하도록 프로그램작성
import java.util.Scanner;
class  IfTestPositive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("임의의 수를 입력해주세요: ");
		n = sc.nextInt();
		
		if(n >= 0)
			n += 100;
		else
			n *= n;
		
		System.out.println(n);
		System.out.println("작업종료");
	}
}
