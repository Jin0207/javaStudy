//�������� ����� ���� �ʹ� ����
//����� ����� �������� ������ ����	�޾�
//�ش��ϴ� �������� ����ϴ� �޼ҵ�
import java.util.Scanner;
class MyUtil
{
	void gugudan(int dan){
		System.out.printf("*** %d�� ***%n",dan);

		for(int i = 1; i <= 9; i++){
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);	
		}
		//return;
	}
}
class  GuGuDanMethod
{
	public static void main(String[] args) 
	{
		MyUtil mu = new MyUtil();
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ұ��?:");
		int dan = sc.nextInt();
		mu.gugudan(dan);
	}
}
