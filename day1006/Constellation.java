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
		do{
			System.out.print("�̸��� �Է��ϼ���: ");
			name = sc.next();
			System.out.print("������ �Է��ϼ���: ");
			month = sc.nextInt();
			while(month<1 || month >12){
				System.out.print("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���!");
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.next();
				System.out.print("������ �Է��ϼ���: ");
				month = sc.nextInt();
				System.out.print("������ �Է��ϼ���: ");
				day = sc.nextInt();	
			}
			System.out.print("������ �Է��ϼ���: ");
			day = sc.nextInt();
			while(day < 0 || day > 31){
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���!");
				System.out.print("�̸��� �Է��ϼ���: ");
				name = sc.next();
				System.out.print("������ �Է��ϼ���: ");
				month = sc.nextInt();
				System.out.print("������ �Է��ϼ���: ");
				day = sc.nextInt();	
			}
			switch(month){
			case 4: case 6: case 9: case 11:
				while(day > 30){
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���!");
					System.out.print("�̸��� �Է��ϼ���: ");
					name = sc.next();
					System.out.print("������ �Է��ϼ���: ");
					month = sc.nextInt();
					System.out.print("������ �Է��ϼ���: ");
					day = sc.nextInt();
				}
				break;
			case 2:
				while(day >28){
					System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ��Է��ϼ���!");
					System.out.print("�̸��� �Է��ϼ���: ");
					name = sc.next();
					System.out.print("������ �Է��ϼ���: ");
					month = sc.nextInt();
					System.out.print("������ �Է��ϼ���: ");
					day = sc.nextInt();
				}
				break;
			} //end while_month
			switch(month){
				case 1:
					if(day > 20){
						result = "�����ڸ�";
					}
					else{
						result = "�����ڸ�";
					}
					break;
				case 2:
					if(day > 18){
						result = "������ڸ�";
					}
					else{
						result = "�����ڸ�";
					}
					break;
				case 3:
					if(day > 20){
						result = "���ڸ�";
					}
					else{
						result = "������ڸ�";
					}
					break;
				case 4:
					if(day > 19){
						result = "Ȳ���ڸ�";
					}
					else{
						result = "���ڸ�";
					}
					break;
				case 5:
					if(day > 20){
						result = "�ֵ����ڸ�";
					}
					else{
						result = "Ȳ���ڸ�";
					}
					break;
				case 6:
					if(day > 21){
						result = "���ڸ�";
					}
					else{
						result = "�ֵ����ڸ�";
					}
					break;
				case 7:
					if(day > 22){
						result = "�����ڸ�";
					}
					else{
						result = "���ڸ�";
					}
					break;
				case 8:
					if(day > 22){
						result = "ó���ڸ�";
					}
					else{
						result = "�����ڸ�";
					}
					break;
				case 9:
					if(day > 23){
						result = "õĪ�ڸ�";
					}
					else{
						result = "ó���ڸ�";
					}
					break;
				case 10:
					if(day > 22){
						result = "�����ڸ�";
					}
					else{
						result = "õĪ�ڸ�";
					}
					break;
				case 11:
					if(day > 22){
						result = "����ڸ�";
					}
					else{
						result = "�����ڸ�";
					}
					break;
				case 12:
					if(day > 24){
						result = "�����ڸ�";
					}
					else{
						result = "����ڸ�";
					}
					break;
			}
			System.out.printf("%s�� ���ڸ��� %s�Դϴ�.%n", name, result);
			System.out.print("�ٽ� �����ұ��?(y/n): ");
			re = sc.next().charAt(0);
		}while(re == 'y');
	}	
}
