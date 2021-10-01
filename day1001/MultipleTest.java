//정수를 읽어 0~정수 사이의 모든 3의배수 출력
//정수값 <0 오류메세지
import java.util.Scanner;
class  MultipleTest
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int n;

		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		for(int i = 1; i <= n; i++){
			if(i % 3 ==0){
				if(i == 3){
					System.out.print(i);
				}else{
					System.out.print("," +i);	
				}	
			}
		}
	}
}
