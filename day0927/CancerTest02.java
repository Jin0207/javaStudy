// �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻� ���� �Ǻ��Ͽ� 
//����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �ۼ��ض�
//���ش� 2021��

import java.util.Scanner;
import java.util.Date;

class CancerTest02{
	public static void main(String []args){ //�ڹ����α׷��� ����� main�޼���, ������ �Ѱ� �����ؾ���
		Scanner sc = new Scanner(System.in); //����� �� �ֵ��� ����� --��ü����
		Date today = new Date();
		String name; 
		int birthYear, age;
		int currentYear = today.getYear() + 1900;
		
		System.out.println("�̸��� �Է����ּ���.");
		name = sc.next();
		System.out.println("��������� �Է����ּ���.");
		birthYear = sc.nextInt();
		
		age = currentYear - birthYear;
		System.out.println("���ش� " + currentYear + "�⵵�Դϴ�");
		if(age >= 40)
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ������̽ʴϴ�.");
		else
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ����ڰ� �ƴϽʴϴ�..");
	}

}
//Note: CancerTest02.java uses or overrides a deprecated API.
//Note: Recompile with -Xlint:deprecation for details.
//������ �Ŵϱ� �ٸ��� ����غ��°� ����� �˷��ִ°�