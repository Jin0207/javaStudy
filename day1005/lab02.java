//switch문, 문자 하나 읽어서 모음과 비모음 구분하는 프로그램 작성
//import java.util.Scanner;
import java.io.IOException;
class lab02 
{
	public static void main(String[] args) throws IOException 
	{
		char ch = '0';
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		ch = sc.next().charAt(0);
		*/
		System.out.print("문자를 입력하세요: ");
		ch = (char) System.in.read();

		switch(ch){
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println("문자 " + ch + "는 모음입니다.");
				break;
			default:
				System.out.println("문자 " + ch + "는 비모음입니다.");
				break;
		}
	}
}
