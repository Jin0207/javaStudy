//switch��, ���� �ϳ� �о ������ ����� �����ϴ� ���α׷� �ۼ�
//import java.util.Scanner;
import java.io.IOException;
class lab02 
{
	public static void main(String[] args) throws IOException 
	{
		char ch = '0';
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���: ");
		ch = sc.next().charAt(0);
		*/
		System.out.print("���ڸ� �Է��ϼ���: ");
		ch = (char) System.in.read();

		switch(ch){
			case 'a': case 'e': case 'i': case 'o': case 'u':
			case 'A': case 'E': case 'I': case 'O': case 'U':
				System.out.println("���� " + ch + "�� �����Դϴ�.");
				break;
			default:
				System.out.println("���� " + ch + "�� ������Դϴ�.");
				break;
		}
	}
}
