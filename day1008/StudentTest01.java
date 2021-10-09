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
class StudentTest01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		s.name = "È«±æµ¿";
		s.kor = 100;
		s.eng = 90;
		s.math = 80;

		s.tot = s.kor + s.eng + s.math;
		s.avg = s.tot / 3.0;

		System.out.println("ÀÌ¸§: " + s.name);
		System.out.println("±¹¾î: " + s.kor);
		System.out.println("¿µ¾î: " + s.eng);
		System.out.println("¼öÇÐ: " + s.math);
		System.out.println("ÃÑÁ¡: " + s.tot);
		System.out.println("Æò±Õ: " + s.avg);

		
	}
}
