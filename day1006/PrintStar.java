//do~while문을 사용하여 *찍기
import java.util.Scanner;
class  PrintStar
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int rows, cols;

		System.out.print("줄 수를 입력하세요 :");
		rows = sc.nextInt();
		System.out.print("칸 수를 입력하세요 :");
		cols = sc.nextInt();

		int i =0;
		do{
			int j = 0;
			do{
				System.out.print("*");
				j++;
			}while(j < cols);//조건식만족하고나오면 j를 0으로 초기화해줘야함

			System.out.println();
			i++;
		}while(i < rows);
	}
}
