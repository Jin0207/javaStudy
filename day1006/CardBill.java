//12개월 동안의 카드 사용금액을 double형 배열에 저장하는 클래스 credit-card를 설계하라.
//사용자로부터 월별 사용 금액을 입력받을때는 음수인지 체크하도록 하라
//1년동안의 전체사용금액, 월별 평균사용금액, 가장 지출이 많았던 월, 가장 지출이 적었던 월
import java.util.Scanner;
class CardBill 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Double[] months = new Double[12];
		Double tot = 0.0, avg = 0.0;
		int max = 0, min = 0;

		for(int i= 0; i < months.length; i++){
			System.out.printf("%d월의 카드사용금액을 입력하세요: ", (i+1));
			months[i] = sc.nextDouble();
			tot += months[i];
		}
		avg = tot / months.length;

		for(int i= 1; i < months.length; i++){
			if(months[i] > months[max]){
				max = i+1;
			}
			if(months[min] > months[i]){
				min = i+1;
			}
		}
		System.out.printf("1년 동안의 전체 사용 금액은 %4.2f원 입니다.%n",tot);
		System.out.printf("월 평균 사용금액은 %4.2f원 입니다.%n",avg);
		System.out.printf("가장 지출이 많았던 달은 %2d월 입니다%n.",max);
		System.out.printf("가장 지출이 적었던 달은 %2d월 입니다.",min);
	}
}
