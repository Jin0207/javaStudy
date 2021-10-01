//이름, 띠, 생월, 생일, 생시 입력받기
import java.util.Scanner;
class  DestinyTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] destiny = {"천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"};
		String name = "", animal = "";
		int birth_m, birth_d, data = 0;
		Double birth_t = 0.0;

		System.out.print("이름을 입력하세요: ");
		name = sc.next();
		System.out.print("띠를 입력하세요 (ex 범띠 -> 범): ");
		animal = sc.next();
		System.out.print("태어난 월을 입력하세요: ");
		birth_m = sc.nextInt();
		System.out.print("태어난 일을 입력하세요: ");
		birth_d = sc.nextInt();
		System.out.print("태어난 생시를 입력하세요 (ex밤11시30분 = 23.30): ");
		birth_t = sc.nextDouble();

		if(birth_m < 1 || birth_m > 12 || birth_d < 0 || birth_d > 32 || birth_t < 0.0 || birth_t > 24.0)
		{
			System.out.println("입력을 잘못하셨습니다.");
		}
		else
		{
			System.out.println(name + "님의 사주팔자 결과");
			//띠 사주팔자
			switch (animal){
				case "쥐": data = 0; break;
				case "소": data = 1; break;
				case "범": data = 2; break;
				case "토끼": data = 3; break;
				case "용": data = 4; break;
				case "뱀": data = 5; break;
				case "말": data = 6; break;
				case "양": data = 7; break;
				case "원숭이": data = 8; break;
				case "닭": data = 9; break;
				case "개": data = 10; break;
				case "돼지": data = 11; break;
				default: System.out.println("띠를 잘못입력하셨습니다.");
			}

			System.out.println("띠: " + destiny[data]);
			//월
			for(int i = 1; i < birth_m; i++){
				data ++;
				if(data == 12){ data = 0; }
			}

			System.out.println("생월: " + destiny[data]);
			//일
			for(int i = 1; i < birth_d; i++){
				if(data == 12){ data = 0; }
				data ++;
			}

			System.out.println("생일: " + destiny[data]);
			//생시
			if(1.30 <= birth_t && birth_t < 3.30){
				data++;
			}
			else if(3.30 <= birth_t && birth_t < 5.30){
				data += 2;
			}
			else if(5.30 <= birth_t && birth_t < 7.30){
				data += 3;
			}
			else if(7.30 <= birth_t && birth_t < 9.30){
				data += 4;
			}
			else if(9.30 <= birth_t && birth_t < 11.30){
				data += 5;
			}
			else if(11.30 <= birth_t && birth_t < 13.30){
				data += 6;
			}
			else if(13.30 <= birth_t && birth_t < 15.30){
				data += 7;
			}
			else if(15.30 <= birth_t && birth_t < 17.30){
				data += 8;
			}
			else if(17.30 <= birth_t && birth_t < 19.30){
				data += 9;
			}
			else if(19.30 <= birth_t && birth_t < 21.30){
				data += 10;
			}
			else if(21.30 <= birth_t && birth_t < 23.30){
				data += 11;
			}

			if( data > 12){
				data -= 12; //data++되면서 끝나니깐
			}

			System.out.println("생시: " + destiny[data]);
		}
	}
}
