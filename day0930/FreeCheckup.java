//��������� �̸��� ��������� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� ����� ����ϴ� ���α׷�
//ó������ ���̰� 40���̻�, �� �ذ� ¦�������� ¦������ Ȧ���� Ȧ���������� ��������
//40�� �̻��̸�  �ϰ����׸��� ����, ����
//50�� �̻��̸� �ϰ����׸��� ����,����, ������Դϴ�.
import java.util.Scanner;
import java.util.Date;

class  FreeCheckup
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		int birthYear, age, currentYear;

		currentYear = today.getYear() + 1900;
		System.out.print("�̸��� �Է����ּ���: ");
		name = sc.next();
		System.out.print("��������� �Է����ּ���: ");
		birthYear = sc.nextInt();
		age = currentYear - birthYear;
		
		System.out.println(name + "���� ���� ���̰� " + age + "�� �̽ʴϴ�.");
		if(age >= 40 && currentYear % 2 == birthYear % 2){
			String checkup = "����, ����";
			if(age >= 50){
				checkup += ", �����";
			}
			System.out.println("����ϰ��� ������̽ø�, �˻��׸�: " + checkup + "�Դϴ�");
		}
		else if(age >= 40){
			System.out.println("���� ����ϰ��� ����� �̽ʴϴ�.");
		}
		else{
			System.out.println("40�� �̻���� ����ϰ��� ������̽ʴϴ�.");
		}
	}
}