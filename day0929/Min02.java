import java.util.Scanner;
class  ConditionalOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, min;

		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		b = sc.nextInt();
		min =(a < b)?a:b;

		System.out.print("�������� " + min + "�Դϴ�.");
	}
}