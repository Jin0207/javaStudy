import java.util.Scanner;

class Avg{
    public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	int com,c,eng,math;
	double avg;

	System.out.println("컴퓨터 개론 과목의 점수를 입력하시오.");
	com = sc.nextInt();
	System.out.println("C언어 프로그래밍 과목의 점수를 입력하시오.");
	c = sc.nextInt();
	System.out.println("영어 과목의 점수를 입력하시오.");
	eng = sc.nextInt();
	System.out.println("일반 수학 과목의 점수를 입력하시오.");
	math = sc.nextInt();
	
	avg = (com + c + eng + math) / 4;
	System.out.println("평균 점수는 " + avg + "입니다");
    } 
}