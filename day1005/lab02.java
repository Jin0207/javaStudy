//switch��, ���� �ϳ� �о ������ ����� �����ϴ� ���α׷� �ۼ�
import java.util.Scanner;
class lab02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = '0';
		String s;

		System.out.print("���ڸ� �Է��ϼ���: ");
		ch = sc.next().charAt(0);

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
