import java.util.Scanner;

class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("10,000���� ���� ������ �Է��Ͻÿ�: ");
		int inputUser = sc.nextInt();
		int th, hun, ten, one;

		if(1000 <= inputUser && inputUser <= 10000){
			th = inputUser / 1000;
			hun = (inputUser % 1000) / 100;
			ten = (inputUser % 100) / 10;
			one = inputUser % 10;

			System.out.println("õ�� �ڸ�: " + th);
			System.out.println("���� �ڸ�: " + hun);
			System.out.println("���� �ڸ�: " + ten);
			System.out.println("���� �ڸ�: " + one);
		}
		else{
			System.out.print("10,000���� ū ������ �Է��ϼ̽��ϴ�.");
		}
	}
}