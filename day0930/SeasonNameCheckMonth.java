//����ڿ��� ���� �Է¹޾� �������� ����ϴ� ���α׷��� �ۼ��غ��ϴ�.
//ó������: �� 3,4,5 ���� 6,7,8 ���� 9,10,11 �ܿ� 12,1,2
import java.util.Scanner;

class  SeasonNameCheckMonth
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = 0;
		String name = " ";

		System.out.print("���� �Է����ּ���.");
		month = sc.nextInt();

		if( 1 <= month && month <= 12)
		{
			if( 3 <= month && month <= 5){
			name = "��";
			}
			else if( 6 <= month && month <= 8){
			name = "����";
			}
			else if( 9 <= month && month <= 11){
			name = "����";
			}
			else{
			name = "�ܿ�";
			}
		System.out.println(month + "�� �� " + name + "�Դϴ�.");
		}

		else {
		System.out.println("1 ~ 12���̷� �Է����ּ���.");
		}
		
	}
}