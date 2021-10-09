import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];

		System.out.print("문자열을 입력하세요 : ");
		String buffer = sc.nextLine();//공백가능 next()는 불가능

		System.out.println(buffer);

		//각 문자가 등장하는 횟수를 계산한다.(단, 빈칸은 제외한다.)
		/*
		for(int i = 0; i < buffer.length(); i++){
			char ch = buffer.charAt(i);
			if(ch != ' '){
				count[ch - 'a']++;//a = 97
			}
		}
		/*
		//배열에 저장된 횟수를 출력하는 반복문
		System.out.println(buffer);
		for(int i = 0; i < count.length; i++){
			System.out.printf("%5d%n",count[i]);
			
		}
		*/
		/*
		//왼쪽에 어떤 문자의 횟수인지 출력하도록 수정
		for(int i = 0; i < count.length; i++){
				System.out.printf("%10c:%5d%n", (char)('a'+i) ,count[i]);	
		}
		*/
		//대문자도 포함해라 'A' : 65, 'a' - 'A' = 32
		//대문자를 소문자로 바꾸자, 
		for(int i = 0; i < buffer.length(); i++){
			char ch = buffer.charAt(i);
			if(ch != ' '){
				if('A' <= ch && ch <= 'Z'){
					ch = (char)(ch + 32);
				}
				count[ch - 'a']++;//a = 97
			}
		}
		for(int i = 0; i < count.length; i++){
				System.out.printf("%10c:%5d%n", (char)('a'+i) ,count[i]);	
		}
	}
}
