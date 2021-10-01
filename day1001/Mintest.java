//3개 정수값 받아 가장작은값 결정 --if문
import java.util.Scanner;
class  Mintest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, min = 0;
		System.out.print("비교할 첫번째 수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("비교할 두번째 수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("비교할 세번째 수를 입력하세요: ");
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
		System.out.print("입력하신 3개의 수 중 가장 작은 수는 " + min + "입니다");
	}
}
