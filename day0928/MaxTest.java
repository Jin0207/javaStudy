//사용자한테 두개의 정수를 입력받아 그 중에 큰수를 찾아 출력하는 프로그램을 작성해보시오.
import java.util.Scanner;

class MaxTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);//Scanner를 사용할 수 있게 준비한다.--객체생성
		int a, b, max;
		
		System.out.println("첫번째 수를 입력하세요.");
		a = sc.nextInt();//scanner를 저장한 변수로부터 scanner에 입력받은 것을 정수로 변환해서 a에 저장한다.
		System.out.println("두번째 수를 입력하세요.");
		b = sc.nextInt();

		if(a > b){ //선택문 if문
			max = a;
		}
		else{
			max = b;
		}
		System.out.println(a + "와" + b + "중 더 큰 값은 " + max);
	}
}
