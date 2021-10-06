//성적을 입력받아 60점 이상이면 "합격" 60점미만이면 "불합격" 출력하는 프로그램
import java.util.Scanner;
class lab01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int score ;

		System.out.print("성적을 입력하세요: ");
		score = sc.nextInt();
		
		if(score >= 80){
			System.out.println("아주 우수하게 합격하였습니다.");
		}else if(socre >= 70){//80점보다 작으면 이 else if 도달하니깐 70~80미만의범위
			System.out.println("우수하게 합격하였습니다.");
		}else if(score >= 60){
			System.out.println("합격하였습니다.");
		}else if(score >= 50){
			System.out.println("안타깝게 불합격하였습니다.");
		}else{
			System.out.println("불합격입니다.");
		}
		/*
		if(score >= 60){
			System.out.println("합격!");
			System.out.println("축하합니다.");
		}else{
			System.out.println("불합격");
		}
		/*
		System.out.println((score >= 60)? "합격" : "불합격");
		*/
	}
}
