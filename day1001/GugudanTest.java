//구구단 몇단인지 입력받아 구구단 출력
import java.util.Scanner;
class  GugudanTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("구구단 중 몇단을 출력할까요? :");
		n = sc.nextInt();

		for(int i = 1; i < 10; i++){
			System.out.println( n + " *" + i + " = " + i * n);
		}
	}
}
