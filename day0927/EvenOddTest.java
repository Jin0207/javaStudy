//사용자에게 임의의 수를 n을 입력받아, n이 홀수인지 짝수인지 판별하여 결과를 출력하는 프로그램
import java.util.Scanner;

class EvenOddTest{
	//java프로그램이 될려면 반드시 하나이상의 클래스로 구성이되어야한다
	//main메서드는 반드시 하나만 가지고 있어야한다
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("숫자를 입력해주세요.");
		n=sc.nextInt();
		
		//선택문 --if(){조건이참일때수행}-else{거짓일때수행}
		if(n % 2 == 0) 
		{ System.out.println(n + "은 짝수입니다");}
		else { System.out.println(n +"은 홀수입니다");} //else에는 조건식이 올 수 없다 --불법이다
	}
} 