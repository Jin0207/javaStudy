//��������� ���ڿ� �Է¹޾� ���ڿ��� ���̰� 4���� �̻����� boolean ������ ���
import java.util.Scanner;
class  BooleanTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���.");
		String userString = sc.next();
		boolean result;
		result = userString.length() >= 4; //�������� ���� booleanŸ�� ������ �����Ͻÿ�.
		
		System.out.println(result);
	}
}
