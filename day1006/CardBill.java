//12���� ������ ī�� ���ݾ��� double�� �迭�� �����ϴ� Ŭ���� credit-card�� �����϶�.
//����ڷκ��� ���� ��� �ݾ��� �Է¹������� �������� üũ�ϵ��� �϶�
//1�⵿���� ��ü���ݾ�, ���� ��ջ��ݾ�, ���� ������ ���Ҵ� ��, ���� ������ ������ ��
import java.util.Scanner;
class CardBill 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] months = new double[12];
		double tot = 0.0, avg = 0.0;

		for(int i= 0; i < months.length; i++){

			do{
				System.out.printf("%d���� ī����ݾ��� �Է��ϼ���: ", (i+1));
				months[i] = sc.nextDouble();
			}while(months[i] < 0); //�迭����� ���� �����̸� �ٽ� ����	
			tot += months[i];
		}

		avg = tot / months.length;
		
		double max = months[0]; //�迭�� �����ɶ� �ڵ��ʱ�ȭ�ǹǷ� pay�� �Է¹����ڿ� �迭��Ұ��� ���� ���� ����
		double min = months[0];
		int max_m = 0, min_m = 0;

		for(int i= 1; i < months.length; i++){
			if(months[i] > max){
				max = months[i];
				max_m = i+1;
			}
			if(min > months[i]){
				min = months[i];
				min_m = i+1;
			}
		}

		System.out.printf("1�� ������ ��ü ��� �ݾ��� %.2f�� �Դϴ�.%n",tot);
		System.out.printf("�� ��� ���ݾ��� %.2f�� �Դϴ�.%n",avg);
		System.out.printf("���� ������ ���Ҵ� ���� %2d���̰� �ݾ��� %.2f�Դϴ�%n.", max_m, max);
		System.out.printf("���� ������ ������ ���� %2d���̰� �ݾ��� %.2f�Դϴ�.", min_m, min);
	}
}
