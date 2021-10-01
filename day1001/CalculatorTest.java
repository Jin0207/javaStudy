//하나의 문자 입력받음, 2개의 숫자 입력받음
//문자가 +,-...이면 수행, 나눗셈은 분모 0인지 if-else
import java.util.Scanner;

class CalculatorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char sign;
		int n1, n2, result = 0;

		System.out.print("수행할 작업을 입력하세요: ");
		sign = sc.next().charAt(0);
		System.out.print("첫번째 수를 입력하세요: ");
		n1 = sc.nextInt();
		System.out.print("두번째 수를 입력하세요: ");
		n2 = sc.nextInt();

		if( sign == '/'){
			if( n2 == 0){
				System.out.print("분모가 " + n2 + "이라 작업을 수행할 수 없습니다.");
			}
			else{
				result = n1 / n2;
			}
		}
		else{
			if(sign == '+'){
				result = n1 + n2;
			}else if(sign == '-'){
				result = n1 - n2;
			}else if(sign == '*'){
				result = n1 * n2;
			}
		}
		System.out.println("실행 결과 : " + result);

	}
}
