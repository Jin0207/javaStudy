import java.util.Scanner;
class  FactorialTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, result=1;

		System.out.print("n을 입력하세요 : ");
		n = sc.nextInt();

		for(int i = n; i >= 1; i--){  //초기값 ; ~하는동안에실행할거다;실행하고나서 i는 어쩔껀지
			result *= i; //5
			System.out.print(i);

			if(i != 1){
				System.out.print("*");
			}
		}

		System.out.println( "=" + result);
		
	}
}