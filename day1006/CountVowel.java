//��������� ���ڿ��� �Է¹޾�
//�Է¹��� ���ڿ��� ������ ���� ���Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;
class CountVowel 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int count = 0;
		char ch;
		System.out.print("���ڿ��� �Է��ϼ���: ");
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
