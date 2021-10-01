/*문자를 입력받아 문자가 'R'이면 사각형의 면적 계산
  T면 삼각형의 면적, C면 원의 면적
  면적 계산 필요한 숫자 입력받기*/
import java.util.Scanner;
class  CalAreaTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char figure;
		int width = 0, height = 0;
		double area = 0.0;

		System.out.print("면적을 구할 도형은? R:사각형, T:삼각형, C:원 ->");
		figure = sc.next().charAt(0);

		if(figure == 'R' || figure == 'r'){

			System.out.print("가로 길이를 입력하세요: ");
			width = sc.nextInt();
			System.out.print("세로 길이를 입력하세요: ");
			height = sc.nextInt();
			area = width * height;
	
		}else if(figure == 'T' || figure == 't'){

			System.out.print("가로 길이를 입력하세요: ");
			width = sc.nextInt();
			System.out.print("세로 길이를 입력하세요: ");
			height = sc.nextInt();
			area = width * height / 2;
			
		}else if(figure == 'C' || figure == 'c'){

			System.out.print("원의 반지름의 길이를 입력하세요: ");
			width = sc.nextInt();
			area = width * width * 3.14;
		}
		System.out.println("면적 : " + area );
	}
}
