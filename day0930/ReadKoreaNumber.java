//��������� 0~9������ ������ �Է¹޾� �ѱ�ǥ��� ����ϴ� ���α׷��� �ۼ� �� ���ϴ�.
import java.util.Scanner;

class  ReadKoreaNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		char kor = '0';
		System.out.print("0~9������ ���ڸ� �Է����ּ���");
		n = sc.nextInt();

		if(0 <= n || n < 10){
			if(n == 0){
				kor = '��';
			}
			else if( n == 1){
				kor = '��';
			}
			else if( n == 2){
				kor = '��';
			}
			else if( n == 3){
				kor = '��';
			}
			else if( n == 4){
				kor = '��';
			}
			else if( n == 5){
				kor = '��';
			}
			else if( n == 6){
				kor = '��';
			}
			else if( n == 7){
				kor = 'ĥ';
			}
			else if( n == 8){
				kor = '��';
			}
			else{
				kor = '��';
			}
			System.out.print(kor);
		}
		else{
			System.out.print(" 0~9������ ���ڰ� �ƴմϴ�.");
		}
	}
}