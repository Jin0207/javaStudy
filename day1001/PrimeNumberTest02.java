import java.util.Scanner;

class PrimeNumberTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true; // �Ҽ��̴ٶ�� �⺻���� ��������

		System.out.print("����� �Ҽ����� �ñ��ϼ���?:");
		n = sc.nextInt();

		for(int i = 2; i < n; i++){
			if(n % i == 0){
				flag = false; //����������� ���� ������ �Ҽ��� �ƴ�
			}
		}
		//if(flag == true){
		if(flag){
			System.out.println( n + "�� �Ҽ��Դϴ�.");
		}else{
			System.out.println( n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
