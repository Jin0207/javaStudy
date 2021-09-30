// 사용자에게 문자열을 입력받아서 입력한 문자열에 소문자 'o'의 수를 파악하여 출력하는 프로그램 작성
import java.util.Scanner; //사용자에게 문자열을 입력을 받을려면 스캐너가 필요하니깐 스캐너 준비
class CountChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String userString;
		
		System.out.println("문자열을 입력해주세요");
		userString = sc.next();
		int count = 0;

		for(int i = 0; i < userString.length(); i = i +1)
			{
			char ch = userString.charAt(i);
			if(ch == 'o')
				count = count +1;
			}

		System.out.println(userString + "안에 소문자 o는 " + count + "개가 포함되어있습니다.");
		}
}
