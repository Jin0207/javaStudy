import java.util.Scanner;
class  SwitchTest04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0 ~ 9 사이의 수를 입력하시오 :");
		n = sc.nextInt();
		if(n < 0 || n > 9){
			System.out.println("입력범위를 넘었습니다.");
		}
		else{
			String result = "";
			switch(n){
				case 0:result = "영";
				case 1:result = "일";
				case 2:result = "이";break;
				case 3:result = "삼";
				case 4:result = "사";
				case 5:result = "오";
				case 6:result = "육";break;
				case 7:result = "칠";break;
				case 8:result = "팔";break;
				case 9:result = "구";
			}
			System.out.println(result);
		}
	}
}
