//1부터 n까지 더한다 n은 사용자에게 입력을 받는다.
import java.util.Scanner;
class  AddNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0, i = 0;
		System.out.print("1부터 몇까지 더할까요? =>");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++){
			sum += i;
		}
			System.out.print("1부터 "+ n +"까지 더한값은 " + sum);
	}
}
