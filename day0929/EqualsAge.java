// �� ����� ���̸� �Է¹޾� ���� ������ �Ǻ��Ͽ� ������ �޼����� ����ϴ� ���α׷� �ۼ�
import java.util.Scanner;
class  EqualsAge
{
	public static void main(String[] args) 
	{
		String name1, name2;
		int age1, age2;
		Scanner sc = new Scanner(System.in);

		System.out.print("�̸��� �Է����ּ���: ");
		name1 = sc.next();
		System.out.print("���̸� �Է����ּ���: ");
		age1 = sc.nextInt();
		System.out.print("�ٸ������ �̸��� �Է����ּ���: ");
		name2 = sc.next();
		System.out.print("�ٸ������ ���̸� �Է����ּ���: ");
		age2 = sc.nextInt();

		if(age1 == age2)
			System.out.println(name1 + " �� " + name2 + "�� �����Դϴ�.");
		else
			System.out.println(name1 + " �� " + name2 + "�� ���̰� �ٸ��ϴ�.");
	}
}