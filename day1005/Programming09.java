//����ڷκ��� x���� �Է¹޾� �Լ��� ����Ͽ� ȭ�� ���
//x�� �Ǽ�
import java.util.Scanner;
class  Programming09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x = 0, result = 0;

		System.out.print("�Ǽ��� x�� �Է��ϼ���: ");
		x = sc.nextDouble();

		if(x <= 0){
			result = Math.pow(x,3) - (9 * x) + 2;-
		}else{
			result = (7 * x) + 2;
		}
		System.out.println( "�Լ����� ��� : " + result);
	}
}
