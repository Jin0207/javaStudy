//이름,생월,생일 입력받아 별자리를 판별하여 출력
//만약 입력값이 잘못되며ㅑㄴ 제대로 된 값을 입력받을 동안 반복실행 또하시겟어요? y는 재실행
import java.util.Scanner;
class Constellation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = "", result = "";
		char re = '0';
		int month = 0, day = 0;
		int[] last = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		do{
			System.out.print("이름을 입력하세요: ");
			name = sc.next();
			
			do{
				System.out.print("생월을 입력하세요: ");
				month = sc.nextInt();
			}while(month<1 || month >12);

			
			do{
				System.out.print("생일을 입력하세요: ");
				day = sc.nextInt();
			}while(day < 0 || day > last[month-1]);

			switch(month){
				case 1: if(day > 20) result = "물병"; else result = "염소"; break;
				case 2: if(day > 18) result = "물고기"; else result = "물병";	break;
				case 3:	if(day > 20) result = "양"; else result = "물고기";	break;
				case 4:	if(day > 19) result = "황소"; else result = "양";	break;
				case 5:	if(day > 20) result = "쌍둥이"; else result = "황소"; break;
				case 6:	if(day > 21) result = "게"; else	result = "쌍둥이"; break;
				case 7:	if(day > 22) result = "사자";	else result = "게"; break;
				case 8:	if(day > 22) result = "처녀"; else result = "사자"; break;
				case 9: if(day > 23) result = "천칭"; else result = "처녀"; break;
				case 10: if(day > 22) result = "전갈";else result = "천칭"; break;
				case 11:if(day > 22) result = "사수";else result = "전갈"; break;
				case 12:if(day > 24) result = "염소";else result = "사수"; break;
			}
			
			System.out.printf("%s의 별자리는 %s자리 입니다.%n", name, result);
			do{
				System.out.print("다시 실행할까요?(y/n): ");
				re = sc.next().charAt(0);
			  }while(re != 'y' && re != 'n' && re != 'Y' && re != 'N');

		}while(re == 'y' || re == 'Y');

		System.out.println("프로그램을 종료합니다.");
	}
}
