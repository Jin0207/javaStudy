// 주석문 : 프로그램에서 실행하지않고 설명하는 문장을 작성하는 곳
// 어떤 학생의 이름, 국어, 영어, 수학 점수를 입력받아 총점과 평균을 구하여 출력하는 프로그램 작성

import java.util.Scanner;
class StudentTest{
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	String name;
	int kor,eng,math,tot,avg; //한줄에 변수 여러개 선언
	
	System.out.println("학생의 이름을 입력하세요.");
	name = sc.next();
	System.out.println("국어 점수는 몇점인가요?");
	kor = sc.nextInt();
	System.out.println("영어 점수는 몇점인가요?");
	eng = sc.nextInt();
	System.out.println("수학 점수는 몇점인가요?");
	math = sc.nextInt();

	tot = kor + eng + math; //대입연산자는 항상 오른쪽을 먼저 수행 후 왼쪽에 대입
	avg = tot / 3;
	System.out.println("** 결과 출력 **");
	System.out.println("이름: " + name);
	System.out.println("국어: " + kor);
	System.out.println("영어: " + eng);
	System.out.println("수학: " + math);
	System.out.println("총점: " + tot);
	System.out.println("평균: " + avg);

   }
}