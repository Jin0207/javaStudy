/*물건 1개 : 100원  
 물건 10개 이상 구입 10% 할인
 개수입력 -> 전체가격 출력 */
import java.util.Scanner;
class  DiscountTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int price = 100;
		int cnt, tot;
		System.out.print(" 몇 개를 구매하실건가요? :");
		cnt = sc.nextInt();
		
		tot = price * cnt;
		System.out.println( "총 가격: " + tot);
		if(cnt >= 10){
			tot = (int)(tot * 0.9); //0.9는 double--실수이기때문에 결과를 형변환
			System.out.println( "10% 할인 후 지불 가격: " + tot);
		}
	}
}
