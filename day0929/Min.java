//���� ��������� �ΰ��� ������ �Է¹޾� �� �߿� ���� ���� ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
import java.util.Scanner;

class  Min
{
	public static void main(String[] args) 
	{
		int a=0, b=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է����ּ���:");
		a = sc.nextInt();
		System.out.print("�� ��° ���� �Է����ּ���:");
		b = sc.nextInt();

		if(a < b) //true��� if�� ���� false��� else�� ����
			System.out.println("�Է��Ͻ� �� �� ���� ���� " + a);
		else
			System.out.println("�Է��Ͻ� �� �� ���� ���� " + b);
	}
}
