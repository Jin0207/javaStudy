//��������� �ΰ��� ������ �Է¹޾� �� �߿� ū���� ã�� ����ϴ� ���α׷��� �ۼ��غ��ÿ�.
import java.util.Scanner;

class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//Scanner�� ����� �� �ְ� �غ��Ѵ�.--��ü����
		int a, b, max;
		
		System.out.println("ù��° ���� �Է��ϼ���.");
		a = sc.nextInt();//scanner�� ������ �����κ��� scanner�� �Է¹��� ���� ������ ��ȯ�ؼ� a�� �����Ѵ�.
		System.out.println("�ι�° ���� �Է��ϼ���.");
		b = sc.nextInt();

		if(a > b){ //���ù� if��
			max = a;
		}
		else{
			max = b;
		}
		System.out.println(a + "��" + b + "�� �� ū ���� " + max);
	}
}