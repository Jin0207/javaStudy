//�̸�, ��, ����, ����, ���� �Է¹ޱ�
import java.util.Scanner;
class  DestinyTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] destiny = {"õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��"};
		String name = "", animal = "";
		int birth_m, birth_d, data = 0;
		Double birth_t = 0.0;

		System.out.print("�̸��� �Է��ϼ���: ");
		name = sc.next();
		System.out.print("�츦 �Է��ϼ��� (ex ���� -> ��): ");
		animal = sc.next();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birth_m = sc.nextInt();
		System.out.print("�¾ ���� �Է��ϼ���: ");
		birth_d = sc.nextInt();
		System.out.print("�¾ ���ø� �Է��ϼ��� (ex��11��30�� = 23.30): ");
		birth_t = sc.nextDouble();

		if(birth_m < 1 || birth_m > 12 || birth_d < 0 || birth_d > 32 || birth_t < 0.0 || birth_t > 24.0)
		{
			System.out.println("�Է��� �߸��ϼ̽��ϴ�.");
		}
		else
		{
			System.out.println(name + "���� �������� ���");
			//�� ��������
			switch (animal){
				case "��": data = 0; break;
				case "��": data = 1; break;
				case "��": data = 2; break;
				case "�䳢": data = 3; break;
				case "��": data = 4; break;
				case "��": data = 5; break;
				case "��": data = 6; break;
				case "��": data = 7; break;
				case "������": data = 8; break;
				case "��": data = 9; break;
				case "��": data = 10; break;
				case "����": data = 11; break;
				default: System.out.println("�츦 �߸��Է��ϼ̽��ϴ�.");
			}

			System.out.println("��: " + destiny[data]);
			//��
			for(int i = 1; i < birth_m; i++){
				data ++;
				if(data == 12){ data = 0; }
			}

			System.out.println("����: " + destiny[data]);
			//��
			for(int i = 1; i < birth_d; i++){
				if(data == 12){ data = 0; }
				data ++;
			}

			System.out.println("����: " + destiny[data]);
			//����
			if(1.30 <= birth_t && birth_t < 3.30){
				data++;
			}
			else if(3.30 <= birth_t && birth_t < 5.30){
				data += 2;
			}
			else if(5.30 <= birth_t && birth_t < 7.30){
				data += 3;
			}
			else if(7.30 <= birth_t && birth_t < 9.30){
				data += 4;
			}
			else if(9.30 <= birth_t && birth_t < 11.30){
				data += 5;
			}
			else if(11.30 <= birth_t && birth_t < 13.30){
				data += 6;
			}
			else if(13.30 <= birth_t && birth_t < 15.30){
				data += 7;
			}
			else if(15.30 <= birth_t && birth_t < 17.30){
				data += 8;
			}
			else if(17.30 <= birth_t && birth_t < 19.30){
				data += 9;
			}
			else if(19.30 <= birth_t && birth_t < 21.30){
				data += 10;
			}
			else if(21.30 <= birth_t && birth_t < 23.30){
				data += 11;
			}

			if( data > 12){
				data -= 12; //data++�Ǹ鼭 �����ϱ�
			}

			System.out.println("����: " + destiny[data]);
		}
	}
}
