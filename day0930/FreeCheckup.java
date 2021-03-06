//사용자한테 이름과 출생연도를 입력받아 무료암검진 대상자인지 판별하여 결과를 출력하는 프로그램
//처리조건 나이가 40세이상, 그 해가 짝수연도면 짝수연도 홀수면 홀수연도생이 무료대상자
//40세 이상이면  암검진항목은 위암, 간암
//50세 이상이면 암검진항목은 위암,간암, 대장암입니다.
import java.util.Scanner;
import java.util.Date;

class  FreeCheckup
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int birthYear, age, currentYear;

		currentYear = today.getYear() + 1900;
		System.out.print("이름을 입력해주세요: ");
		name = sc.next();
		System.out.print("출생연도를 입력해주세요: ");
		birthYear = sc.nextInt();
		age = currentYear - birthYear;
		
		System.out.println(name + "님은 올해 나이가 " + age + "살 이십니다.");
		if(age >= 40 && currentYear % 2 == birthYear % 2){
			String checkup = "위암, 간암";
			if(age >= 50){
				checkup += ", 대장암";
			}
			System.out.println("무료암검진 대상자이시며, 검사항목: " + checkup + "입니다");
		}
		else if(age >= 40){
			System.out.println("내년 무료암검진 대상자 이십니다.");
		}
		else{
			System.out.println("40살 이상부터 무료암검진 대상자이십니다.");
		}
	}
}
