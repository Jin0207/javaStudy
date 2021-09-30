// 학생의 이름, 국어, 영어, 수학을 입력받아 국어점수>=90 평균점수 >= 90 장학금지급 
import java.util.Scanner;
class  SelectionStudent
{
	public static void main(String[] args) 
	{
		String name;
		int kor, eng, math, tot;
		double avg;
		Scanner sc = new Scanner(System.in);

		System.out.print("학생의 이름을 입력해주세요: ");
		name = sc.next();
		System.out.print("국어 점수를 입력해주세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력해주세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력해주세요: ");
		math = sc.nextInt();
		tot = kor + eng + math;
		avg = tot / 3.0;
		
		System.out.println("**결과 출력**");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + avg);

		if(kor >= 90 && avg >= 90)
			System.out.println("장학생으로 선발되었습니다.");
		else
			System.out.println("아쉽게도 장학생으로 선발되지않았습니다.");
	}
}
