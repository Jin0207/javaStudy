//학생의 이름,국어,영어,수학을 입력받아 총점과 평균을 구하여 출력한다음, 평균이 60점이상이면 합격 아니면 불합격
import java.util.Scanner;

class  PassTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,math,sum;
		double avg;

		System.out.print("학생 이름을 입력하세요: ");
		name = sc.next();
		System.out.print("국어 점수를 입력하세요: ");
		kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요: ");
		eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요: ");
		math = sc.nextInt();

		sum = kor + eng + math;
		avg = (double)sum / 3;
		//avg = sum / 3.0;

		System.out.println("**결과 출력**");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		
		if(avg >= 60)
		   System.out.println("평균은 " + avg + "점으로 합격입니다");
		else
			System.out.println("평균은 " + avg + "점으로 불합격입니다");
		
	}
}
