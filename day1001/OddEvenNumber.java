//��������� � �� n�� �Է¹޾� 1���� n������ ¦���� ��, Ȧ���� ��, ¦���� ����, Ȧ���� ������ ���� ���Ͽ� ����ϴ� ���α׷�
import java.util.Scanner;
class  OddEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, odd_sum = 0, even_sum = 0, odd_cnt = 0, even_cnt = 0;
		String odd = "", even = "";

		System.out.print("1���� ������� Ȧ���� ¦�� ������ ������ ���� ���ұ��: ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			if( i % 2 ==0){
				even_sum += i;
				even_cnt++;

				if(i == 2){
					even += i;
				}
				else{
					even += ", "+ i;
				}
			}
			else{
				odd_sum += i;
				odd_cnt++;

				if(i == 1){
					odd += i;
				}
				else{
					odd += ", "+ i;
				}
			}
		}
		System.out.println("1���� " + n + "������ �� ��");
		System.out.println("¦��: " +even);
		System.out.println("����: " + even_cnt);
		System.out.println("��: " + even_sum);
		System.out.println("------------------");
		System.out.println("Ȧ��: " + odd);
		System.out.println("����: " + odd_cnt);
		System.out.println("��: " + odd_sum);
	}
}