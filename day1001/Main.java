import java.util.Scanner;
class  Main
{
	public static void main(String[] args) 
	{
		int n = 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n < 1 || n > 10000){
			System.out.println("n�� 1~10000������ �� �Դϴ�");
		}else{
			for(int i = 1; i <= n; i++){
				sum += i;		
			}
			System.out.print(sum);
		}
	}
}