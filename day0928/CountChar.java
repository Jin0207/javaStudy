// ����ڿ��� ���ڿ��� �Է¹޾Ƽ� �Է��� ���ڿ��� �ҹ��� 'o'�� ���� �ľ��Ͽ� ����ϴ� ���α׷� �ۼ�
import java.util.Scanner; //����ڿ��� ���ڿ��� �Է��� �������� ��ĳ�ʰ� �ʿ��ϴϱ� ��ĳ�� �غ�
class CountChar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String userString;
		
		System.out.println("���ڿ��� �Է����ּ���");
		userString = sc.next();
		int count = 0;

		for(int i = 0; i < userString.length(); i = i +1)
			{
			char ch = userString.charAt(i);
			if(ch == 'o')
				count = count +1;
			}

		System.out.println(userString + "�ȿ� �ҹ��� o�� " + count + "���� ���ԵǾ��ֽ��ϴ�.");
		}
}
