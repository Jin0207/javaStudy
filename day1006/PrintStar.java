//do~while���� ����Ͽ� *���
import java.util.Scanner;
class  PrintStar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rows, cols;

		System.out.print("�� ���� �Է��ϼ��� :");
		rows = sc.nextInt();
		System.out.print("ĭ ���� �Է��ϼ��� :");
		cols = sc.nextInt();

		int i =0;
		do{
			int j = 0;
			do{
				System.out.print("*");
				j++;
			}while(j < cols);//���ǽĸ����ϰ����� j�� 0���� �ʱ�ȭ�������

			System.out.println();
			i++;
		}while(i < rows);
	}
}
