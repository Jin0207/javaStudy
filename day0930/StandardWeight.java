//Ű�� �Է¹޾� ǥ��ü���� ����� �� ������� ü�߰� ��
//��ü��, ǥ��, ��ü������ �Ǵ��ϴ� ���α׷� �ۼ�
import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double tall, weight, standard;
		String result = "";

		System.out.print("Ű�� �Է��ϼ���: ");
		tall = sc.nextDouble();
		System.out.print("�����Ը� �Է��ϼ���: ");
		weight = sc.nextDouble();
		standard = (tall - 100) * 0.9;
		System.out.println( tall + "�� ǥ��ü���� " + standard + "�Դϴ�.");
		
		if( weight < standard) result = "��ü��";
		else if(weight == standard) result = "ǥ��ü��";
		else result = "��ü��";
		
		System.out.println( "������� ü���� " + result + "�Դϴ�.");
	}
}
