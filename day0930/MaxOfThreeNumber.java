//세개의수 입력받아 가장큰수 출력
import java.util.Scanner;
class  MaxOfThreeNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;

		System.out.print("첫 번째 숫자를 입력해주세요.");
		a = sc.nextInt();
		System.out.print("두 번째 숫자를 입력해주세요.");
		b = sc.nextInt();
		System.out.print("세 번째 숫자를 입력해주세요.");
		c = sc.nextInt();
		/*
		if( a > b && a > c)
			max = a;
		else if(b > a && b > c)
			max = b;
		else
			max = c;
		*/
		if(a > b){  
			if(a > c){   //중첩선택문
				max = a;
			}
			else{
				max = c; //중첩선택문에서 else가 오면 else와 가장 가까운 if에 대응된다.
			}
		}
		else{
			if(b>c){
				max = b;
			}
			else{
				max = c;
			}
		}

		System.out.print("입력하신 3개의 수 중 가장 큰 수는 " + max + "입니다");
	}
}
