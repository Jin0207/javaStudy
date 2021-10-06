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
		do{
			System.out.print("이름을 입력하세요: ");
			name = sc.next();
			System.out.print("생월을 입력하세요: ");
			month = sc.nextInt();
			while(month<1 || month >12){
				System.out.print("잘못입력하셨습니다. 다시입력하세요!");
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				System.out.print("생월을 입력하세요: ");
				month = sc.nextInt();
				System.out.print("생일을 입력하세요: ");
				day = sc.nextInt();	
			}
			System.out.print("생일을 입력하세요: ");
			day = sc.nextInt();
			while(day < 0 || day > 31){
				System.out.println("잘못입력하셨습니다. 다시입력하세요!");
				System.out.print("이름을 입력하세요: ");
				name = sc.next();
				System.out.print("생월을 입력하세요: ");
				month = sc.nextInt();
				System.out.print("생일을 입력하세요: ");
				day = sc.nextInt();	
			}
			switch(month){
			case 4: case 6: case 9: case 11:
				while(day > 30){
					System.out.println("잘못입력하셨습니다. 다시입력하세요!");
					System.out.print("이름을 입력하세요: ");
					name = sc.next();
					System.out.print("생월을 입력하세요: ");
					month = sc.nextInt();
					System.out.print("생일을 입력하세요: ");
					day = sc.nextInt();
				}
				break;
			case 2:
				while(day >28){
					System.out.println("잘못입력하셨습니다. 다시입력하세요!");
					System.out.print("이름을 입력하세요: ");
					name = sc.next();
					System.out.print("생월을 입력하세요: ");
					month = sc.nextInt();
					System.out.print("생일을 입력하세요: ");
					day = sc.nextInt();
				}
				break;
			} //end while_month
			switch(month){
				case 1:
					if(day > 20){
						result = "물병자리";
					}
					else{
						result = "염소자리";
					}
					break;
				case 2:
					if(day > 18){
						result = "물고기자리";
					}
					else{
						result = "물병자리";
					}
					break;
				case 3:
					if(day > 20){
						result = "양자리";
					}
					else{
						result = "물고기자리";
					}
					break;
				case 4:
					if(day > 19){
						result = "황소자리";
					}
					else{
						result = "양자리";
					}
					break;
				case 5:
					if(day > 20){
						result = "쌍둥이자리";
					}
					else{
						result = "황소자리";
					}
					break;
				case 6:
					if(day > 21){
						result = "게자리";
					}
					else{
						result = "쌍둥이자리";
					}
					break;
				case 7:
					if(day > 22){
						result = "사자자리";
					}
					else{
						result = "게자리";
					}
					break;
				case 8:
					if(day > 22){
						result = "처녀자리";
					}
					else{
						result = "사자자리";
					}
					break;
				case 9:
					if(day > 23){
						result = "천칭자리";
					}
					else{
						result = "처녀자리";
					}
					break;
				case 10:
					if(day > 22){
						result = "전갈자리";
					}
					else{
						result = "천칭자리";
					}
					break;
				case 11:
					if(day > 22){
						result = "사수자리";
					}
					else{
						result = "전갈자리";
					}
					break;
				case 12:
					if(day > 24){
						result = "염소자리";
					}
					else{
						result = "사수자리";
					}
					break;
			}
			System.out.printf("%s의 별자리는 %s입니다.%n", name, result);
			System.out.print("다시 실행할까요?(y/n): ");
			re = sc.next().charAt(0);
		}while(re == 'y');
	}	
}
