//3�� ������ �޾� ���������� ���� --if��
import java.util.Scanner;
class  Mintest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, min = 0;
		System.out.print("���� ù��° ���� �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("���� �ι�° ���� �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("���� ����° ���� �Է��ϼ���: ");
		c = sc.nextInt();
		
		if(a < b){
			if( a < c){
				min = a;
			}
			else{
				min = c;
			}
		}else{
			if(b < c){
				min = b;
			}else{
				min = c;
			}
		}
		System.out.print("�Է��Ͻ� 3���� �� �� ���� ���� ���� " + min + "�Դϴ�");
	}
}
