//���ο��� �ݳ����� 40�� �̻��� ����鿡�� ����ϰ��� �ǽ�
//�̸�,��������� �Է¹޾� ��������� �Ǻ�
//����ڴ� 40�� �̻��̰� ���ذ� ¦�� �����̸� ¦�������� �¾���, ���ذ� Ȧ���� Ȧ�������� �¾���
import java.util.Scanner;
import java.util.Date;

class CancerTest03{
   public static void main(String []args){
   	Scanner sc = new Scanner(System.in);
	Date dd = new Date();
	String name;
	int birthYear, age;
	int currentYear = dd.getYear() + 1900;
	
	System.out.println("�̸��� �Է����ּ���.");
	name = sc.next();
	System.out.println("��������� �Է����ּ���.");
	birthYear = sc.nextInt();
	age = currentYear - birthYear;
	
	if( age >= 40 && currentYear % 2 == birthYear % 2)
	  System.out.println(name + "���� " + currentYear + "�⵵��" +  age + "���̸� ������̽ʴϴ�.");
	else
	  System.out.println(name + "���� ���� " + age + "���̸� ����ڰ� �ƴϽʴϴ�.");
 }
}