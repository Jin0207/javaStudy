//키를 입력받아 표준체중을 계산한 후 사용자의 체중과 비교
//저체중, 표준, 과체중인지 판단하는 프로그램 작성
import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double tall, weight, standard;
		String result = "";

		System.out.print("키를 입력하세요: ");
		tall = sc.nextDouble();
		System.out.print("몸무게를 입력하세요: ");
		weight = sc.nextDouble();
		standard = (tall - 100) * 0.9;
		System.out.println( tall + "의 표준체중은 " + standard + "입니다.");
		
		if( weight < standard) result = "저체중";
		else if(weight == standard) result = "표준체중";
		else result = "과체중";
		
		System.out.println( "사용자의 체중은 " + result + "입니다.");
	}
}
