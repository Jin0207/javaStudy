import java.util.Scanner;
class DestinyTestTeacher 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] destiny = {"õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��"};
		String[] animals = {"��","��","��","�䳢","��","��","��","��","������","��","��","����"};
		String[] birth_t = {"��","��","��","��","��","��","��","��","��","��","��","��"};
		String name, year, time;
		int month, date;

		System.out.print("�̸��� �Է��ϼ��� -->");
		name = sc.next();
		System.out.print("�츦 �Է��ϼ��� -->");
		year = sc.next();
		System.out.print("������ �Է��ϼ��� -->");
		month = sc.nextInt();
		System.out.print("������ �Է��ϼ��� -->");
		date = sc.nextInt();
		System.out.print("���ø� �Է��ϼ��� ex)�ڽ� = �� -->");
		time = sc.next();
		
		for(int i = 0; i < animals.length; i++){
			if(year.equals(animals[i])){
				year = Integer.toString(i);
				break;
			}
		}
		for(int i = 0; i < birth_t.length; i++){
			if(time.equals(birth_t[i])){
				time = Integer.toString(i);
				break;
			}
		}

		int n = Integer.parseInt(year);
		System.out.println("***" + name + "���� �������� Ǯ�� ***");
		System.out.println("������ ����� " + destiny[n]);
		n = (n + month - 1) % 12;
		System.out.println("������ ����� " + destiny[n]);
		n = (n + date - 1) % 12;
		System.out.println("������ ����� " + destiny[n]);
		n = (n + Integer.parseInt(time)) % 12;
		System.out.println("������ ����� " + destiny[n]);

	}
}
