import java.util.Scanner;

class InputString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요");
		String userString = sc.next();
		
		char firstChar = userString.charAt(0);
		System.out.println("첫번째 문자:" + firstChar);
		/*
		System.out.println("첫번째 문자:" + userString.charAt(0));
		*/
		/*String firstString = userString.charAt(0) + ""; //char + ""-> string
		String firstString = userString.substring(0,1);
		System.out.println("첫번째 문자:" + firstString);
		*/
	}
}
