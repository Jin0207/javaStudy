import java.util.Scanner;
class WhileCorrectValueInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = 0;
		/*
		for(;;){
			System.out.print("월을 입력하세요 : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}
		*/
		/*
		while(true){
			System.out.print("월을 입력하세요 : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}*/
		while(month < 1 || month >12){
			System.out.print("월을 입력하세요 : ");
			month = sc.nextInt();
		}
		/*
		do{
			System.out.print("월을 입력하세요 : ");
			month = sc.nextInt();
			if(1 <= month && month <=12){
				break;
			}
		}while(true);
		*/
		String name = "";
		if(3 <= month && month <= 5){
			name = "봄";
		}else if(6 <= month && month <= 8){
			name = "여름";
		}else if(9 <= month && month <= 11){
			name = "가을";
		}else{
			name = "겨울";
		}
		System.out.printf("%d월은 %s입니다.", month, name);
	}
}
