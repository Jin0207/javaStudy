//�������� ����� ���� �ʹ� ����
//����� ����� �������� ������ ����	�޾�
//�ش��ϴ� �������� ����ϴ� �޼ҵ�
import java.util.Scanner;
class  GuGuDanMethod02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?:");
		int dan = sc.nextInt();
		MyUtil.gugudan(dan);
	}
}

class MyUtil
{
	static void gugudan(int dan){
		System.out.printf("*** %d�� ***%n",dan);

		for(int i = 1; i <= 9; i++){
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);	
		}
		//return;
	}
}
