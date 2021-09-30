import java.util.Scanner;

class Ex09 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("10,000보다 적은 정수를 입력하시오: ");
		int inputUser = sc.nextInt();
		int th, hun, ten, one;

		if(1000 <= inputUser && inputUser <= 10000){
			th = inputUser / 1000;
			hun = (inputUser % 1000) / 100;
			ten = (inputUser % 100) / 10;
			one = inputUser % 10;

			System.out.println("천의 자리: " + th);
			System.out.println("백의 자리: " + hun);
			System.out.println("십의 자리: " + ten);
			System.out.println("일의 자리: " + one);
		}
		else{
			System.out.print("10,000보다 큰 정수를 입력하셨습니다.");
		}
	}
}
