//연습) 사용자한테 두개의 정수를 입력받아 더하기.빼기,곱하기,나누기 한 결과를 출력하는 프로그램

import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
	int num1,num2;
	Scanner sc = new Scanner(System.in);

	System.out.println("첫번 째 숫자를 입력해주세요.");
	num1 = sc.nextInt();	
	System.out.println("두번 째 숫자를 입력해주세요.");
	num2 = sc.nextInt();
	
	System.out.println("** 결과 출력 **");
	System.out.println("두 수를 더한 값은 " + (num1 + num2));//화면출력시 연산할려면 ()
	System.out.println("두 수를 뺀 값은 " + (num1 - num2));
	System.out.println("두 수를 곱한 값은 " + (num1 * num2));
	System.out.println("두 수를 나눈 값은 " + (num1 / num2));

	//한번만 출력하고 말아 하면 화면출력시
	//계속 사용할거라면 변수에 저장
   }
}