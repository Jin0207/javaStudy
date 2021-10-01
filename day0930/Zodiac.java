//사용자한테 생월과 생일, 이름을 입력받아 별자리를 판별하여 출력하는 프로그램작성
import java.util.Scanner;
class  Zodiac
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int month = 0, day = 31;
		String data = "";
		
		System.out.print("이름을 입력해주세요: ");
		name = sc.next();
		System.out.print("생월을 입력해주세요: ");
		month = sc.nextInt();
		System.out.print("생일을 입력해주세요: ");
		day = sc.nextInt();
		
		if(month == 2)
			{ 
				day = 28; 
			}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				day = 30;
			}
		if( day < 0 || day > 31) 
			{System.out.println("잘못된 값을 입력하셨습니다.");}
		else{
				switch (month)
				{
					case 1: if(day < 20) data = "염소자리";
							else data = "물병자리";
							break;
					case 2: if(day < 19) data = "물병자리";
							else data = "물고기자리";
							break;
					case 3: if(day < 21) data = "물고기자리";
							else data = "양자리";
							break;
					case 4: if(day < 20) data = "양자리";
							else data = "황소자리";
							break;
					case 5: if(day < 21) data = "황소자리";
							else data = "쌍둥이자리";
							break;
					case 6: if(day < 22) data = "쌍둥이자리";
							else data = "게자리";
							break;
					case 7: if(day < 23) data = "게자리";
							else data = "사자자리";
							break;
					case 8: if(day < 23) data = "사자자리";
							else data = "처녀자리";
							break;
					case 9: if(day < 24) data = "처녀자리";
							else data = "천칭자리";
							break;
					case 10:if(day < 23) data = "천칭자리";
							else data = "전갈자리";
							break;
					case 11:if(day < 23) data = "전갈자리";
							else data = "사수자리";
							break;
					case 12:if(day < 25) data = "사수자리";
							else data = "염소자리";
							break;
					default : System.out.println("잘못된 값을 입력하셨습니다.");	
				}
				System.out.println(name + "의 별자리는 " + data + "다");
		}
	}
}
