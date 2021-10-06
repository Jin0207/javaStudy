//사용자한테 n을 입력받아 1~n까지의 합을 누적하여 출력하는 프로그램
import java.util.Scanner;
class  SumDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, tot = 0;

		System.out.print("1 ~ 몇까지 더할까요: ");
		n = sc.nextInt();
		int i = 0;
		
		do{
			tot += i;
			i++;
		}while(i <= n);

		System.out.printf("1에서 %d까지의 합은 %d입니다.",n ,tot);
	}
}
