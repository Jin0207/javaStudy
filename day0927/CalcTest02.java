//����) ��������� �ΰ��� ������ �Է¹޾� ���ϱ�.����,���ϱ�,������ �� ����� ����ϴ� ���α׷�

import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
	int num1,num2;
	Scanner sc = new Scanner(System.in);

	System.out.println("ù�� ° ���ڸ� �Է����ּ���.");
	num1 = sc.nextInt();	
	System.out.println("�ι� ° ���ڸ� �Է����ּ���.");
	num2 = sc.nextInt();
	
	System.out.println("** ��� ��� **");
	System.out.println("�� ���� ���� ���� " + (num1 + num2));//ȭ����½� �����ҷ��� ()
	System.out.println("�� ���� �� ���� " + (num1 - num2));
	System.out.println("�� ���� ���� ���� " + (num1 * num2));
	System.out.println("�� ���� ���� ���� " + (num1 / num2));

	//�ѹ��� ����ϰ� ���� �ϸ� ȭ����½�
	//��� ����ҰŶ�� ������ ����
   }
}