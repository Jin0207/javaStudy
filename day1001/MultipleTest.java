//������ �о� 0~���� ������ ��� 3�ǹ�� ���
//������ <0 �����޼���
import java.util.Scanner;
class  MultipleTest
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("0�̻��� ������ �Է��ϼ��� : ");
		n = sc.nextInt();

		if( n < 0){
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{
			for(int i = 1; i <= n; i++){
				if(i % 3 ==0){
					if(i == 3){
						System.out.print(i);
					}else{
						System.out.print("," +i);	
					}	
				}
			}
		}
	}
}
