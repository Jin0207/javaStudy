//�л��� �̸�,����,����,������ �Է¹޾� ������ ����� ���Ͽ� ����Ѵ���, ����� 60���̻��̸� �հ� �ƴϸ� ���հ�
import java.util.Scanner;

class  PassTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,sum;
		double avg;

		System.out.print("�л� �̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("���� ������ �Է��ϼ���: ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ���: ");
		math = sc.nextInt();

		sum = kor + eng + math;
		avg = (double)sum / 3;
		//avg = sum / 3.0;

		System.out.println("**��� ���**");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + sum);
		
		if(avg >= 60)
		   System.out.println("����� " + avg + "������ �հ��Դϴ�");
		else
			System.out.println("����� " + avg + "������ ���հ��Դϴ�");
		
	}
}
