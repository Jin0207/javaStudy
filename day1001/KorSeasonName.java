//사용자한테 월을 입력받아 계절명을 출력하는 프로그램을 switch-case문을 이용하여 작성
import java.util.Scanner;
class  KorSeasonName
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String season = "";

		System.out.print("월을 입력해주세요: ");
		month = sc.nextInt();

		switch(month){
			case 3: case 4: case 5: 
				{
				System.out.println(month + "월의 계절은 봄입니다.");
				 break; 
				}
			case 6: case 7: case 8: 
				{System.out.println(month + "월의 계절은 봄입니다.");
					break; 
				}
			case 9: case 10: case 11: 
				{System.out.println(month + "월의 계절은 봄입니다.");
				break; 
				 }
			case 12: case 1: case 2: 
				{System.out.println(month + "월의 계절은 봄입니다.");
				  break; 
				}
			default: System.out.println("잘못입력하셨어요.");
		}
		
	}
}
