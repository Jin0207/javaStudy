// ��������� ������ �� n�� �Է¹޾� N�� ����̸� �� ���� 100�� ���� ���� ����� ���� "�۾�����"�� ����ϰ�
// �׷��� ������ �� ���� ������ ����Ѵ��� "�۾�����"�� ����ϵ��� ���α׷��ۼ�
import java.util.Scanner;
class  IfTestPositive
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;

		System.out.print("������ ���� �Է����ּ���: ");
		n = sc.nextInt();
		
		if(n >= 0)
			n += 100;
		else
			n *= n;
		
		System.out.println(n);
		System.out.println("�۾�����");
	}
}
