import java.util.Scanner;
class  SwitchTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("0 ~ 9 사이의 수를 입력하시오 :");
		n = sc.nextInt();

		switch(n){
			case 1:
			case 0: //값의 순서는 상관x 사용자 마음임
			case 2:
			case 3:System.out.println("삼");	break;
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:System.out.println("팔");	break;
			case 9:
			default:System.out.println("잘못된 수를 입력하셧어요");
		}
	}
}
