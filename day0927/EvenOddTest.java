//����ڿ��� ������ ���� n�� �Է¹޾�, n�� Ȧ������ ¦������ �Ǻ��Ͽ� ����� ����ϴ� ���α׷�
import java.util.Scanner;

class EvenOddTest{
	//java���α׷��� �ɷ��� �ݵ�� �ϳ��̻��� Ŭ������ �����̵Ǿ���Ѵ�
	//main�޼���� �ݵ�� �ϳ��� ������ �־���Ѵ�
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("���ڸ� �Է����ּ���.");
		n=sc.nextInt();
		
		//���ù� --if(){���������϶�����}-else{�����϶�����}
		if(n % 2 == 0) 
		{ System.out.println(n + "�� ¦���Դϴ�");}
		else { System.out.println(n +"�� Ȧ���Դϴ�");} //else���� ���ǽ��� �� �� ���� --�ҹ��̴�
	}
} 