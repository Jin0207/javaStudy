//����) ��������� �ΰ��� ������ �Է¹޾� ���ϱ�.����,���ϱ�,������ �� ����� ����ϴ� ���α׷�

import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
	int num1,num2,add,sub,multiply,divide;
	Scanner sc = new Scanner(System.in);

	System.out.println("ù�� ° ���ڸ� �Է����ּ���.");
	num1 = sc.nextInt();	
	System.out.println("�ι� ° ���ڸ� �Է����ּ���.");
	num2 = sc.nextInt();
	
	add = num1 + num2;
	sub = num1 - num2;
	multiply = num1 * num2;
	divide = num1 / num2;
	
	System.out.println("** ��� ��� **");
	System.out.println("�� ���� ���� ���� " + add);
	System.out.println("�� ���� �� ���� " + sub);
	System.out.println("�� ���� ���� ���� " + multiply);
	System.out.println("�� ���� ���� ���� " + divide);


   }
}