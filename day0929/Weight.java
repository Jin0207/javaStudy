import java.util.Scanner;

class  Weight
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int g = 454; 
		double weight;
		
		System.out.print("몸무게를 입력해주세요 단위:파운드 ->");
		weight = sc.nextDouble();

		weight *= g;
		System.out.print("몸무게를 그램으로 환산하면: " + weight);
	}
}
