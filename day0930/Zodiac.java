//��������� ������ ����, �̸��� �Է¹޾� ���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷��ۼ�
import java.util.Scanner;
class  Zodiac
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int month = 0, day = 31;
		String data = "";
		
		System.out.print("�̸��� �Է����ּ���: ");
		name = sc.next();
		System.out.print("������ �Է����ּ���: ");
		month = sc.nextInt();
		System.out.print("������ �Է����ּ���: ");
		day = sc.nextInt();
		
		if(month == 2)
			{ 
				day = 28; 
			}
		else if(month == 4 || month == 6 || month == 9 || month == 11)
			{
				day = 30;
			}
		if( day < 0 || day > 31) 
			{System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");}
		else{
				switch (month)
				{
					case 1: if(day < 20) data = "�����ڸ�";
							else data = "�����ڸ�";
							break;
					case 2: if(day < 19) data = "�����ڸ�";
							else data = "�������ڸ�";
							break;
					case 3: if(day < 21) data = "�������ڸ�";
							else data = "���ڸ�";
							break;
					case 4: if(day < 20) data = "���ڸ�";
							else data = "Ȳ���ڸ�";
							break;
					case 5: if(day < 21) data = "Ȳ���ڸ�";
							else data = "�ֵ����ڸ�";
							break;
					case 6: if(day < 22) data = "�ֵ����ڸ�";
							else data = "���ڸ�";
							break;
					case 7: if(day < 23) data = "���ڸ�";
							else data = "�����ڸ�";
							break;
					case 8: if(day < 23) data = "�����ڸ�";
							else data = "ó���ڸ�";
							break;
					case 9: if(day < 24) data = "ó���ڸ�";
							else data = "õĪ�ڸ�";
							break;
					case 10:if(day < 23) data = "õĪ�ڸ�";
							else data = "�����ڸ�";
							break;
					case 11:if(day < 23) data = "�����ڸ�";
							else data = "����ڸ�";
							break;
					case 12:if(day < 25) data = "����ڸ�";
							else data = "�����ڸ�";
							break;
					default : System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");	
				}
				System.out.println(name + "�� ���ڸ��� " + data + "��");
		}
	}
}