//��������� ���� �Է� �޾�, �� ���� ������ ��¥�� ����ϴ� ���α׷��� �ۼ�
//ó������ ���� ����
import java.util.Scanner;

class  LastDayOfMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month, endDay = 31;
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		if(month < 1 || month > 12){
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
		}
		else{
			if(month == 2 ){
				endDay = 28;
			}
			else if(month == 4 || month == 6 || month == 9 || month == 11){
			endDay = 30;
			}
			System.out.println(month + "���� " + endDay + "�ϱ��� �־��!");	
		}
	
	}
}