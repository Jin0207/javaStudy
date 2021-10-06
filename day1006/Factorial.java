import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, result = 1;
		System.out.print("n을 입력하세요 : ");
		n = sc.nextInt();
		
		int i = n;
		while(i >= 1){
			System.out.printf("%d",n);
			if(i != 1){
				System.out.print("*");
			}
			result *= i;
			i--;
		}
		System.out.printf("=%d", result);
		
	}
}
