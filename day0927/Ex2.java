import java.util.Scanner;
import java.lang.Math;

class Ex2{
   public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	double x;
	
	System.out.println("�Ǽ� x�� ���� �Է����ּ���");
	x = sc.nextDouble(); //�Ҽ������� ���� �ִ°��� �Է¹��� �� ����
	//double answer = 3 * (x * x * x) - 7 * (x *x) + 9;
	double answer = 3 * Math.pow(x,3) - 7 * Math.pow(x,2) + 9; 
	System.out.println(answer);
	
   }
}