//�ϳ��� ���� �Է¹���, 2���� ���� �Է¹���
//���ڰ� +,-...�̸� ����, �������� �и� 0���� if-else
import java.util.Scanner;

class CalculatorTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char sign;
		int n1, n2, result = 0;

		System.out.print("������ �۾��� �Է��ϼ���: ");
		sign = sc.next().charAt(0);
		System.out.print("ù��° ���� �Է��ϼ���: ");
		n1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է��ϼ���: ");
		n2 = sc.nextInt();

		if( sign == '/'){
			if( n2 == 0){
				System.out.print("�и� " + n2 + "�̶� �۾��� ������ �� �����ϴ�.");
			}
			else{
				result = n1 / n2;
			}
		}
		else{
			if(sign == '+'){
				result = n1 + n2;
			}else if(sign == '-'){
				result = n1 - n2;
			}else if(sign == '*'){
				result = n1 * n2;
			}
		}
		System.out.println("���� ��� : " + result);

	}
}