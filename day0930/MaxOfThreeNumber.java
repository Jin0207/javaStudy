//�����Ǽ� �Է¹޾� ����ū�� ���
import java.util.Scanner;
class  MaxOfThreeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;

		System.out.print("ù ��° ���ڸ� �Է����ּ���.");
		a = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ���.");
		b = sc.nextInt();
		System.out.print("�� ��° ���ڸ� �Է����ּ���.");
		c = sc.nextInt();
		/*
		if( a > b && a > c)
			max = a;
		else if(b > a && b > c)
			max = b;
		else
			max = c;
		*/
		if(a > b){  
			if(a > c){   //��ø���ù�
				max = a;
			}
			else{
				max = c; //��ø���ù����� else�� ���� else�� ���� ����� if�� �����ȴ�.
			}
		}
		else{
			if(b>c){
				max = b;
			}
			else{
				max = c;
			}
		}

		System.out.print("�Է��Ͻ� 3���� �� �� ���� ū ���� " + max + "�Դϴ�");
	}
}