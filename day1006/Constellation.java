//�̸�,����,���� �Է¹޾� ���ڸ��� �Ǻ��Ͽ� ���
//���� �Է°��� �߸��Ǹ���� ����� �� ���� �Է¹��� ���� �ݺ����� ���Ͻðپ��? y�� �����
import java.util.Scanner;
class Constellation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = "", result = "";
		char re = '0';
		int month = 0, day = 0;
		int[] last = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		do{
			System.out.print("�̸��� �Է��ϼ���: ");
			name = sc.next();
			
			do{
				System.out.print("������ �Է��ϼ���: ");
				month = sc.nextInt();
			}while(month<1 || month >12);

			
			do{
				System.out.print("������ �Է��ϼ���: ");
				day = sc.nextInt();
			}while(day < 0 || day > last[month-1]);

			switch(month){
				case 1: if(day > 20) result = "����"; else result = "����"; break;
				case 2: if(day > 18) result = "�����"; else result = "����";	break;
				case 3:	if(day > 20) result = "��"; else result = "�����";	break;
				case 4:	if(day > 19) result = "Ȳ��"; else result = "��";	break;
				case 5:	if(day > 20) result = "�ֵ���"; else result = "Ȳ��"; break;
				case 6:	if(day > 21) result = "��"; else	result = "�ֵ���"; break;
				case 7:	if(day > 22) result = "����";	else result = "��"; break;
				case 8:	if(day > 22) result = "ó��"; else result = "����"; break;
				case 9: if(day > 23) result = "õĪ"; else result = "ó��"; break;
				case 10: if(day > 22) result = "����";else result = "õĪ"; break;
				case 11:if(day > 22) result = "���";else result = "����"; break;
				case 12:if(day > 24) result = "����";else result = "���"; break;
			}
			
			System.out.printf("%s�� ���ڸ��� %s�ڸ� �Դϴ�.%n", name, result);
			do{
				System.out.print("�ٽ� �����ұ��?(y/n): ");
				re = sc.next().charAt(0);
			  }while(re != 'y' && re != 'n' && re != 'Y' && re != 'N');

		}while(re == 'y' || re == 'Y');

		System.out.println("���α׷��� �����մϴ�.");
	}
}
