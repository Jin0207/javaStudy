import java.util.Scanner;
class  ConditionalEvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = 0;
		String result;
		
		System.out.print("���ڸ� �Է��ϼ���");
		N = sc.nextInt();
		result = (N % 2 ==0? "¦��": "Ȧ��");
		System.out.println(result);
	}
}
