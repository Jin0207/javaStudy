//��������� n�� �Է¹޾� n�� ����� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. %
import java.util.Scanner;
class  DivisorTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, divisor = 0;

		System.out.print("� ���� ����� ����ұ��? :");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			if( n % i == 0){
				divisor = i;
				if(i == 1){
					System.out.print(n + "�� ����� " + divisor);
				}
				else{
					System.out.print("," + divisor);	
				}
			}
		}
		System.out.print(" �Դϴ�.");
	}
}