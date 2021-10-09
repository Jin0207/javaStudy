//12개월 동안의 카드 사용금액을 double형 배열에 저장하는 클래스 credit-card를 설계하라.
//사용자로부터 월별 사용 금액을 입력받을때는 음수인지 체크하도록 하라
//1년동안의 전체사용금액, 월별 평균사용금액, 가장 지출이 많았던 월, 가장 지출이 적었던 월
import java.util.Scanner;
class CardBill 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] months = new double[12];
		double tot = 0.0, avg = 0.0;

		for(int i= 0; i < months.length; i++){

			do{
				System.out.printf("%d월의 카드사용금액을 입력하세요: ", (i+1));
				months[i] = sc.nextDouble();
			}while(months[i] < 0); //배열요소의 값이 음수이면 다시 실행	
			tot += months[i];
		}

		avg = tot / months.length;
		
		double max = months[0]; //배열은 생성될때 자동초기화되므로 pay를 입력받은뒤에 배열요소값을 지닌 변수 선언
		double min = months[0];
		int max_m = 0, min_m = 0;

		for(int i= 1; i < months.length; i++){
			if(months[i] > max){
				max = months[i];
				max_m = i+1;
			}
			if(min > months[i]){
				min = months[i];
				min_m = i+1;
			}
		}

		System.out.printf("1년 동안의 전체 사용 금액은 %.2f원 입니다.%n",tot);
		System.out.printf("월 평균 사용금액은 %.2f원 입니다.%n",avg);
		System.out.printf("가장 지출이 많았던 달은 %2d월이고 금액은 %.2f입니다%n.", max_m, max);
		System.out.printf("가장 지출이 적었던 달은 %2d월이고 금액은 %.2f입니다.", min_m, min);
	}
}
