//사용자한테 어떤 수 n을 입력받아 1에서 n까지의 짝수의 합, 홀수의 합, 짝수의 개수, 홀수의 개수를 각각 구하여 출력하는 프로그램
import java.util.Scanner;
class  OddEvenNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, odd_sum = 0, even_sum = 0, odd_cnt = 0, even_cnt = 0;
		String odd = "", even = "";

		System.out.print("1에서 몇까지의 홀수와 짝수 각각의 개수와 합을 구할까요: ");
		n = sc.nextInt();

		for(int i = 1; i <= n; i++){
			if( i % 2 ==0){
				even_sum += i;
				even_cnt++;

				if(i == 2){
					even += i;
				}
				else{
					even += ", "+ i;
				}
			}
			else{
				odd_sum += i;
				odd_cnt++;

				if(i == 1){
					odd += i;
				}
				else{
					odd += ", "+ i;
				}
			}
		}
		System.out.println("1에서 " + n + "까지의 수 중");
		System.out.println("짝수: " +even);
		System.out.println("개수: " + even_cnt);
		System.out.println("합: " + even_sum);
		System.out.println("------------------");
		System.out.println("홀수: " + odd);
		System.out.println("개수: " + odd_cnt);
		System.out.println("합: " + odd_sum);
	}
}
