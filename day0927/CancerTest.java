// 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상 인지 판별하여 
//무료암검진 대상자인지 결과를 출력하도록 프로그램을 작성해라
//올해는 2021년

import java.util.Scanner;

class CancerTest{
	public static void main(String []args){ //자바프로그램의 출발인 main메서드, 무조건 한개 존재해야함
		Scanner sc = new Scanner(System.in);
		String name; 
		int birthYear, age;
		int currentYear = 2021;
		
		System.out.println("이름을 입력해주세요.");
		name = sc.next();
		System.out.println("출생연도로 입력해주세요.");
		birthYear = sc.nextInt();
		
		age = currentYear - birthYear;
		if(age >= 40)
		   System.out.println(name + "님은 " + age + "세로 무료암검진 대상자이십니다.");
		else
		   System.out.println(name + "님은 " + age + "세로 무료암검진 대상자가 아니십니다..");
	}

}