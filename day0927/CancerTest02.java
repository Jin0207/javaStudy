// 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상 인지 판별하여 
//무료암검진 대상자인지 결과를 출력하도록 프로그램을 작성해라
//올해는 2021년

import java.util.Scanner;
import java.util.Date;

class CancerTest02{
	public static void main(String []args){ //자바프로그램의 출발인 main메서드, 무조건 한개 존재해야함
		Scanner sc = new Scanner(System.in); //사용할 수 있도록 만든다 --객체생성
		Date today = new Date();
		String name; 
		int birthYear, age;
		int currentYear = today.getYear() + 1900;
		
		System.out.println("이름을 입력해주세요.");
		name = sc.next();
		System.out.println("출생연도를 입력해주세요.");
		birthYear = sc.nextInt();
		
		age = currentYear - birthYear;
		System.out.println("올해는 " + currentYear + "년도입니다");
		if(age >= 40)
		   System.out.println(name + "님은 " + age + "세로 무료암검진 대상자이십니다.");
		else
		   System.out.println(name + "님은 " + age + "세로 무료암검진 대상자가 아니십니다..");
	}

}
//Note: CancerTest02.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//오래된 거니깐 다른걸 사용해보는게 어떨까라고 알려주는거