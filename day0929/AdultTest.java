//��Ʈ�������ڸ� ����ؼ� �λ���� ���̸� �Է¹޾� �� ��� ��� 20���̻����� �Ǻ��Ͽ� ������ �޼����� ����ϴ� ���α׷�
import java.util.Scanner;

class  BitLogical
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1, age2;

		System.out.print("���̸� �Է����ּ���: ");
		age1 = sc.nextInt();
		System.out.print("���̸� �Է����ּ���: ");
		age2 = sc.nextInt();

		if(age1 >= 20 & age2 >= 20)
			System.out.println("�� ��� ��� 20�� �̻��Դϴ�.");
		else
			System.out.println("�λ�� ��� 20�� �̻��� �ƴմϴ�.");
	}
}