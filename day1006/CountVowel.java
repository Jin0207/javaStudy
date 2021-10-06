//사용자한테 문자열을 입력받아
//입력받은 문자열의 모음의 수를 구하여 출력하는 프로그램을 작성하시오.
import java.util.Scanner;
class CountVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		char ch;
		System.out.print("문자열을 입력하세요: ");
		s = sc.next();
				
		for(int i = 0; i < s.length(); i++){
			ch = s.charAt(i);
			switch(ch){
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				count++;
				break;
			}
		}

		System.out.println(count);
	
	}
}
