/*���ڸ� �Է¹޾� ���ڰ� 'R'�̸� �簢���� ���� ���
  T�� �ﰢ���� ����, C�� ���� ����
  ���� ��� �ʿ��� ���� �Է¹ޱ�*/
import java.util.Scanner;
class  CalAreaTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char figure;
		int width = 0, height = 0;
		double area = 0.0;

		System.out.print("������ ���� ������? R:�簢��, T:�ﰢ��, C:�� ->");
		figure = sc.next().charAt(0);

		if(figure == 'R' || figure == 'r'){

			System.out.print("���� ���̸� �Է��ϼ���: ");
			width = sc.nextInt();
			System.out.print("���� ���̸� �Է��ϼ���: ");
			height = sc.nextInt();
			area = width * height;
	
		}else if(figure == 'T' || figure == 't'){

			System.out.print("���� ���̸� �Է��ϼ���: ");
			width = sc.nextInt();
			System.out.print("���� ���̸� �Է��ϼ���: ");
			height = sc.nextInt();
			area = width * height / 2;
			
		}else if(figure == 'C' || figure == 'c'){

			System.out.print("���� �������� ���̸� �Է��ϼ���: ");
			width = sc.nextInt();
			area = width * width * 3.14;
		}
		System.out.println("���� : " + area );
	}
}
