//사용자한테 0~9사이의 정수를 입력받아 한글표기식 출력하는 프로그램을 작성 해 봅니다.
import java.util.Scanner;

class  ReadKoreaNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		char kor = '0';
		System.out.print("0~9사이의 숫자를 입력해주세요");
		n = sc.nextInt();

		if(0 <= n || n < 10){
			if(n == 0){
				kor = '영';
			}
			else if( n == 1){
				kor = '일';
			}
			else if( n == 2){
				kor = '이';
			}
			else if( n == 3){
				kor = '삼';
			}
			else if( n == 4){
				kor = '사';
			}
			else if( n == 5){
				kor = '오';
			}
			else if( n == 6){
				kor = '육';
			}
			else if( n == 7){
				kor = '칠';
			}
			else if( n == 8){
				kor = '팔';
			}
			else{
				kor = '구';
			}
			System.out.print(kor);
		}
		else{
			System.out.print(" 0~9사이의 숫자가 아닙니다.");
		}
	}
}
