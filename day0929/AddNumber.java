//1���� n���� ���Ѵ� n�� ����ڿ��� �Է��� �޴´�.
import java.util.Scanner;
class  AddNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0, sum = 0, i = 0;
		System.out.print("1���� ����� ���ұ��? =>");
		n = sc.nextInt();
		
		for(i = 1; i <= n; i++){
			sum += i;
		}
			System.out.print("1���� "+ n +"���� ���Ѱ��� " + sum);
	}
}