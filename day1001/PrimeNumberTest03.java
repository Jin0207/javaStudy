import java.util.Scanner;

class PrimeNumberTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true; 

		System.out.print("����� �Ҽ����� �ñ��ϼ���?:");
		n = sc.nextInt();

		for(int i = 2; i < n; i++){
			if(n % i == 0){
				flag = false;
				break;
			}
		}

		if(flag){ 
			System.out.println( n + "�� �Ҽ��Դϴ�.");
		}else{
			System.out.println( n + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}