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
		
		//if(++age1 >= 20 & ++age2 >= 20)//���ǽ��� �տ� ���� false���� �ڿ� ���ǽ��� �õ��غ�
		if(++age1 >= 20 && ++age2 >= 20)//�տ� ������ false�̸� �ڿ��� ������� 
			System.out.println("�λ���� ���̸� 1�� �����ϸ� �� ��� ��� 20�� �̻��Դϴ�.");
		else
			System.out.println("�λ���� ���̸� 1�� �����ϸ� �λ�� ��� 20�� �̻��� �ƴմϴ�.");

		System.out.println("age1: " + age1); //19
		System.out.println("age2: " + age2); //23
	}
}