//사용자에게 월을 입력받아 계절명을 출력하는 프로그램을 작성해봅니다.
//처리조건: 봄 3,4,5 여름 6,7,8 가을 9,10,11 겨울 12,1,2
import java.util.Scanner;

class  SeasonNameCheckMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String name = " ";

		System.out.print("월을 입력해주세요.");
		month = sc.nextInt();

		if( 1 <= month && month <= 12)
		{
			if( 3 <= month && month <= 5){
			name = "봄";
			}
			else if( 6 <= month && month <= 8){
			name = "여름";
			}
			else if( 9 <= month && month <= 11){
			name = "가을";
			}
			else{
			name = "겨울";
			}
		System.out.println(month + "월 은 " + name + "입니다.");
		}

		else {
		System.out.println("1 ~ 12사이로 입력해주세요.");
		}
		
	}
}
