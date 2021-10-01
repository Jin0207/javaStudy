import java.util.Scanner;

class PrimeNumberTest02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		boolean flag = true; // 소수이다라고 기본값을 넣을거임

		System.out.print("어떤수가 소수인지 궁금하세요?:");
		n = sc.nextInt();

		for(int i = 2; i < n; i++){
			if(n % i == 0){
				flag = false; //나누어떨어지는 수가 있으면 소수가 아님
			}
		}
		//if(flag == true){
		if(flag){
			System.out.println( n + "은 소수입니다.");
		}else{
			System.out.println( n + "은 소수가 아닙니다.");
		}
	}
}
