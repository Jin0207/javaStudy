//���� ��������� �ΰ��� ������ �Է¹޾� ��Ģ������ ������ ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;

class  CalcInput
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("ù ��° ���� �Է��Ͻÿ�:");
		int a = sc.nextInt();
		System.out.print("�� ��° ���� �Է��Ͻÿ�:");
		int b = sc.nextInt();

		int add = a + b;
		int sub = a - b;
		int multi = a * b;
		int divide = a / b;
		int mode = a % b;
		
		System.out.println("*** ��Ģ���� ***");
		System.out.println( a + "+" + b + "= " + add);
		System.out.println( a + "-" + b + "= " + sub);
		System.out.println( a + "*" + b + "= " + multi);
		System.out.println( a + "/" + b + "= " + divide);
		System.out.println( a + "%" + b + "= " + mode);
	}
}
