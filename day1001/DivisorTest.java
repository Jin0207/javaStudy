//사용자한테 n을 입력받아 n의 약수를 모두 출력하는 프로그램을 작성하시오. %
import java.util.Scanner;
class  DivisorTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, divisor = 0;

		System.out.print("어떤 수의 약수를 출력할까요? :");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			if( n % i == 0){
				divisor = i;
				if(i == 1){
					System.out.print(n + "의 약수는 " + divisor);
				}
				else{
					System.out.print("," + divisor);	
				}
			}
		}
		System.out.print(" 입니다.");
	}
}
