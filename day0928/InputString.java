import java.util.Scanner;

class InputString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ���");
		String userString = sc.next();
		
		char firstChar = userString.charAt(0);
		System.out.println("ù��° ����:" + firstChar);
		/*
		System.out.println("ù��° ����:" + userString.charAt(0));
		*/
		/*String firstString = userString.charAt(0) + ""; //char + ""-> string
		String firstString = userString.substring(0,1);
		System.out.println("ù��° ����:" + firstString);
		*/
	}
}
