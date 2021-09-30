//연습) 사용자한테 두개의 정수를 입력받아 더하기.빼기,곱하기,나누기 한 결과를 출력하는 프로그램

import java.util.Scanner;
class CalcTest{
   public static void main(String []args){
	int num1,num2,add,sub,multiply,divide;
	Scanner sc = new Scanner(System.in);

	System.out.println("첫번 째 숫자를 입력해주세요.");
	num1 = sc.nextInt();	
	System.out.println("두번 째 숫자를 입력해주세요.");
	num2 = sc.nextInt();
	
	add = num1 + num2;
	sub = num1 - num2;
	multiply = num1 * num2;
	divide = num1 / num2;
	
	System.out.println("** 결과 출력 **");
	System.out.println("두 수를 더한 값은 " + add);
	System.out.println("두 수를 뺀 값은 " + sub);
	System.out.println("두 수를 곱한 값은 " + multiply);
	System.out.println("두 수를 나눈 값은 " + divide);


   }
}