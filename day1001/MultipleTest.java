//������ �о� 0~���� ������ ��� 3�ǹ�� ���
//������ <0 �����޼���
import java.util.Scanner;
class  MultipleTest
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("������ �Է��ϼ��� : ");
		n = sc.nextInt();
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
