//12���� ������ ī�� ���ݾ��� double�� �迭�� �����ϴ� Ŭ���� credit-card�� �����϶�.
//����ڷκ��� ���� ��� �ݾ��� �Է¹������� �������� üũ�ϵ��� �϶�
//1�⵿���� ��ü���ݾ�, ���� ��ջ��ݾ�, ���� ������ ���Ҵ� ��, ���� ������ ������ ��
import java.util.Scanner;
class CardBill 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Double[] months = new Double[12];
		Double tot = 0.0, avg = 0.0;
		int max = 0, min = 0;

		for(int i= 0; i < months.length; i++){
			System.out.printf("%d���� ī����ݾ��� �Է��ϼ���: ", (i+1));
			months[i] = sc.nextDouble();
			tot += months[i];
		}
		avg = tot / months.length;

		for(int i= 1; i < months.length; i++){
			if(months[i] > months[max]){
				max = i+1;
			}
			if(months[min] > months[i]){
				min = i+1;
			}
		}
		System.out.printf("1�� ������ ��ü ��� �ݾ��� %4.2f�� �Դϴ�.%n",tot);
		System.out.printf("�� ��� ���ݾ��� %4.2f�� �Դϴ�.%n",avg);
		System.out.printf("���� ������ ���Ҵ� ���� %2d�� �Դϴ�%n.",max);
		System.out.printf("���� ������ ������ ���� %2d�� �Դϴ�.",min);
	}
}
