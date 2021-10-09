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
		이와같이 변수 2개가 필요하다면
		*/
		Student[] s = new Student[2];
		//Student타입의 변수 2개를 만듦 -- 배열을 통해서
		s[0] = new Student();
		//인덱스 0번째인 s의 배열요소에 새로운 student객체를 만들어주고 가리키게함
		s[0].name = "홍길동";
		System.out.println(s[0].name);
	}
}
