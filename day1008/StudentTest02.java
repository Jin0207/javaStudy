import java.util.Scanner;
class Student
{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
}
class StudentTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		n = 100; //�⺻�ڷ��� ������ �����ϰ� ���� �ٷ� ������ �� ����

		Student s;
		/*�׷��� �����ڷ����� ��ü���������� �����ϰ� �ٷ� ���� ������ �� ����
		s.name = "ȫ�浿"; <-- ���Ұ�
		����Ϸ��� �ݵ�� ��ü���������� ���ؼ� new�����ڸ� �̿��Ͽ� ��ü������ �� ��밡��
		*/
		s = new Student();
		//��� �ϰ� s�� ���ؼ� ��������� ����� �� ����
		s.name = "ȫ�浿";
		System.out.println(s.name);
	}
}
