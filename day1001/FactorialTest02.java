import java.util.Scanner;
class  FactorialTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, result=1;

		System.out.print("n�� �Է��ϼ��� : ");
		n = sc.nextInt();

		for(int i = n; i >= 1; i--){  //�ʱⰪ ; ~�ϴµ��ȿ������ҰŴ�;�����ϰ��� i�� ��¿����
			result *= i; //5
			System.out.print(i);

			if(i != 1){
				System.out.print("*");
			}
		}

		System.out.println( "=" + result);
		
	}
}