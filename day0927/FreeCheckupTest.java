//���ο����� �ų� 40�� �̻��� ����鿡�� ���� �ϰ����� �ǽ��ϰ� �ֽ��ϴ�.
//�̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�

import java.util.Scanner;

class FreeCheckupTest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		String name; 
		int age;
		
		System.out.println("�̸��� �Է����ּ���.");
		name = sc.next();
		System.out.println("���̸� �Է����ּ���.");
		age = sc.nextInt();
		
		if(age >= 40)
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ������̽ʴϴ�.");
		else
		   System.out.println(name + "���� " + age + "���� ����ϰ��� ����ڰ� �ƴϽʴϴ�..");
	}

}