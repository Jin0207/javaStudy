//��������� n�� �Է¹޾� 1~n������ ���� �����Ͽ� ����ϴ� ���α׷�
import java.util.Scanner;
class  SumDoWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, tot = 0;

		System.out.print("1 ~ ����� ���ұ��: ");
		n = sc.nextInt();
		int i = 0;
		
		do{
			tot += i;
			i++;
		}while(i <= n);

		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n ,tot);
	}
}
