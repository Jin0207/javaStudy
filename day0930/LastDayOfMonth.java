//사용자한테 월을 입력 받아, 그 월의 마지막 날짜를 출력하는 프로그램을 작성
//처리조건 윤년 제외
import java.util.Scanner;

class  LastDayOfMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, endDay = 31;
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		if(month < 1 || month > 12){
			System.out.println("입력값이 잘못되었습니다.");
		}
		else{
			if(month == 2 ){
				endDay = 28;
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11){
			endDay = 30;
			}
			System.out.println(month + "월은 " + endDay + "일까지 있어요!");	
		}
	
	}
}
