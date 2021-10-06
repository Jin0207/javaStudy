/*
  반복문을 이용하여 다음과 같이 동작하는 프로그램을 작성해봅니다.(for, while, do~while)
  n을 입력하면
  *
  **
  ***
  ...
*/
import java.util.Scanner;
class  PrintIncreasingNumberOfStars
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, i = 0, j = 0;

		System.out.print("n을 입력하세요 :");
		n = sc.nextInt();

		/*
		//for문 이용
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//while문 이용
		i = 1;
		while(i <= n){
			j = 1;
			while(j <= i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		/*
		//do~while문 이용
		i = 1;
		do{
			j = 1;

			do
			{
				System.out.print("*");
				j++;
			}
			while (j <= i);

			i++;
			System.out.println();
		}while(i <= n);
		*/
	}
}
