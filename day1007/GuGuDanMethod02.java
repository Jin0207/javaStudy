//구구단을 출력할 일이 너무 많아
//몇단을 출력할 것인지를 변수로 전달	받아
//해당하는 구구단을 출력하는 메소드
import java.util.Scanner;
class  GuGuDanMethod02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단을 출력할까요?:");
		int dan = sc.nextInt();
		MyUtil.gugudan(dan);
	}
}

class MyUtil
{
	static void gugudan(int dan){
		System.out.printf("*** %d단 ***%n",dan);

		for(int i = 1; i <= 9; i++){
			System.out.printf("%d*%d=%d%n",dan,i,dan*i);	
		}
		//return;
	}
}
