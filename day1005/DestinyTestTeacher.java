import java.util.Scanner;
class DestinyTestTeacher 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] destiny = {"천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"};
		String[] animals = {"쥐","소","범","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};
		String[] birth_t = {"자","축","인","묘","진","사","오","미","슬","유","슬","해"};
		String name, year, time;
		int month, date;

		System.out.print("이름을 입력하세요 -->");
		name = sc.next();
		System.out.print("띠를 입력하세요 -->");
		year = sc.next();
		System.out.print("생월을 입력하세요 -->");
		month = sc.nextInt();
		System.out.print("생일을 입력하세요 -->");
		date = sc.nextInt();
		System.out.print("생시를 입력하세요 ex)자시 = 자 -->");
		time = sc.next();
		
		for(int i = 0; i < animals.length; i++){
			if(year.equals(animals[i])){
				year = Integer.toString(i);
				break;
			}
		}
		for(int i = 0; i < birth_t.length; i++){
			if(time.equals(birth_t[i])){
				time = Integer.toString(i);
				break;
			}
		}

		int n = Integer.parseInt(year);
		System.out.println("***" + name + "님의 사주팔자 풀이 ***");
		System.out.println("생년의 운명은 " + destiny[n]);
		n = (n + month - 1) % 12;
		System.out.println("생월의 운명은 " + destiny[n]);
		n = (n + date - 1) % 12;
		System.out.println("생일의 운명은 " + destiny[n]);
		n = (n + Integer.parseInt(time)) % 12;
		System.out.println("생시의 운명은 " + destiny[n]);

	}
}
