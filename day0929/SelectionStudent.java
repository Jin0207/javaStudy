// �л��� �̸�, ����, ����, ������ �Է¹޾� ��������>=90 ������� >= 90 ���б����� 
import java.util.Scanner;
class  SelectionStudent
{
	public static void main(String[] args) 
	{
		String name;
		int kor, eng, math, tot;
		double avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("�л��� �̸��� �Է����ּ���: ");
		name = sc.next();
		System.out.print("���� ������ �Է����ּ���: ");
		kor = sc.nextInt();
		System.out.print("���� ������ �Է����ּ���: ");
		eng = sc.nextInt();
		System.out.print("���� ������ �Է����ּ���: ");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = tot / 3.0;
		
		System.out.println("**��� ���**");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);

		if(kor >= 90 && avg >= 90)
			System.out.println("���л����� ���ߵǾ����ϴ�.");
		else
			System.out.println("�ƽ��Ե� ���л����� ���ߵ����ʾҽ��ϴ�.");
	}
}
