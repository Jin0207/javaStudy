// �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻� ���� �Ǻ��Ͽ� 
//����ϰ��� ��������� ����� ����ϵ��� ���α׷��� �ۼ��ض�
//���ش� 2021��

import java.util.Scanner;

class CancerTest{
	public static void main(String []args){ //�ڹ����α׷��� ����� main�޼���, ������ �Ѱ� �����ؾ���
		Scanner sc = new Scanner(System.in);
		String name; 
		int birthYear, age;
		int currentYear = 2021;
		
		System.out.println("�̸��� �Է����ּ���.");
		name = sc.next();
		System.out.println("��������� �Է����ּ���.");
		birthYear = sc.nextInt();
		
		age = currentYear - birthYear;
		if(age >= 40)
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ������̽ʴϴ�.");
		else
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ����ڰ� �ƴϽʴϴ�..");
	}

}