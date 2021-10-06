//사용자로부터 x값을 입력받아 함수값 계산하여 화면 출력
//x는 실수
import java.util.Scanner;
class  Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x = 0, result = 0;

		System.out.print("실수값 x를 입력하세요: ");
		x = sc.nextDouble();

		if(x <= 0){
			result = Math.pow(x,3) - (9 * x) + 2;-
		}else{
			result = (7 * x) + 2;
		}
		System.out.println( "함수값의 결과 : " + result);
	}
}
