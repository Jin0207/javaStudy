import java.util.Scanner;
class CountLetter 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];

		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String buffer = sc.nextLine();//���鰡�� next()�� �Ұ���

		System.out.println(buffer);

		//�� ���ڰ� �����ϴ� Ƚ���� ����Ѵ�.(��, ��ĭ�� �����Ѵ�.)
		/*
		for(int i = 0; i < buffer.length(); i++){
			char ch = buffer.charAt(i);
			if(ch != ' '){
				count[ch - 'a']++;//a = 97
			}
		}
		/*
		//�迭�� ����� Ƚ���� ����ϴ� �ݺ���
		System.out.println(buffer);
		for(int i = 0; i < count.length; i++){
			System.out.printf("%5d%n",count[i]);
			
		}
		*/
		/*
		//���ʿ� � ������ Ƚ������ ����ϵ��� ����
		for(int i = 0; i < count.length; i++){
				System.out.printf("%10c:%5d%n", (char)('a'+i) ,count[i]);	
		}
		*/
		//�빮�ڵ� �����ض� 'A' : 65, 'a' - 'A' = 32
		//�빮�ڸ� �ҹ��ڷ� �ٲ���, 
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
