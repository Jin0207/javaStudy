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
		n = 100; //기본자료형 변수는 선언하고 값을 바로 저장할 수 있음

		Student s;
		/*그러나 참조자료형인 객체참조변수는 선언하고 바로 값을 저장할 수 없음
		s.name = "홍길동"; <-- 사용불가
		사용하려면 반드시 객체참조변수를 통해서 new연산자를 이용하여 객체생성한 후 사용가능
		*/
		s = new Student();
		//라고 하고 s를 통해서 멤버변수를 사용할 수 있음
		s.name = "홍길동";
		System.out.println(s.name);
	}
}
