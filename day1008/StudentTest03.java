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
class StudentTest03 
{
	public static void main(String[] args) 
	{	
		/*
		Student s1;
		Student s2;
		�̿Ͱ��� ���� 2���� �ʿ��ϴٸ�
		*/
		Student[] s = new Student[2];
		//StudentŸ���� ���� 2���� ���� -- �迭�� ���ؼ�
		s[0] = new Student();
		//�ε��� 0��°�� s�� �迭��ҿ� ���ο� student��ü�� ������ְ� ����Ű����
		s[0].name = "ȫ�浿";
		System.out.println(s[0].name);
	}
}
