//ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� ���̿� Ű�� �Է¹޾� ���������� �ϰ� �ִ�.
//���̰� 20�� �̻��̰� Ű�� 160�����̸� "���尡��" �׷��������� "����Ұ���"�� ����ϴ� ���α׷��� �ۼ�,����,�������Ͽ� ����

import java.util.Scanner;

class EnterClub{
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	String name;
	int age, tall;

	System.out.println("�̸��� �Է��ϼ���.");
	name = sc.next();
	System.out.println("���̸� �Է��ϼ���.");
	age = sc.nextInt();
	System.out.println("Ű�� �Է��ϼ���.");
	tall = sc.nextInt();

	if( age >= 20 && tall <= 160) //��� �����Ѵٸ� �����Ѵ� 
	  System.out.println(name + "���� ���尡���Ͻʴϴ�.");
	else
	  System.out.println(name + "���� ������ ��ƽ��ϴ�.");	
   }
}