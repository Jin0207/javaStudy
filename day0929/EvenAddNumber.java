import java.util.Scanner;
class  ConditionalEvenOddTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		String result;
		
		System.out.print("������ ���� �Է��ϼ���");
		n = sc.nextInt();
		result = ((n % 2 ==0)? "¦��": "Ȧ��");
		System.out.println(n + "��" + result + "�Դϴ�");
	}
}