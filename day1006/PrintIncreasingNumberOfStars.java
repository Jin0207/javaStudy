/*
  �ݺ����� �̿��Ͽ� ������ ���� �����ϴ� ���α׷��� �ۼ��غ��ϴ�.(for, while, do~while)
  n�� �Է��ϸ�
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

		System.out.print("n�� �Է��ϼ��� :");
		n = sc.nextInt();

		/*
		//for�� �̿�
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		//while�� �̿�
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
		//do~while�� �̿�
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
