import java.util.Scanner;

class  Weight
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int g = 454; 
		double weight;
		
		System.out.print("�����Ը� �Է����ּ��� ����:�Ŀ�� ->");
		weight = sc.nextDouble();

		weight *= g;
		System.out.print("�����Ը� �׷����� ȯ���ϸ�: " + weight);
	}
}
