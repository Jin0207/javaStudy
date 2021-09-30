//사용자한테 문자열 입력받아 문자열의 길이가 4글자 이상인지 boolean 값으로 출력
import java.util.Scanner;
class  BooleanTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요.");
		String userString = sc.next();
		boolean result;
		result = userString.length() >= 4; //논리연산한 값을 boolean타입 변수에 저장하시오.
		
		System.out.println(result);
	}
}
