//���� ��������� �ΰ��� ������ �Է¹޾� �� �߿� ���� ���� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
import java.util.Scanner;

class  Min
{
	public static void main(String[] args) 
	{
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���ڸ� �Է��ϼ���:);
		a = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���:);
		b = sc.nextInt();

		if(a > b)
			System.out.println(b);
		else
			System.out.println(a);
	}
}
