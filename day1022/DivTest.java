/*
	프로그램 실행 시
	두개의 정수를 전달받아
	나누기 한 결과를 출력하는 프로그램을 작성해보자

	프로그램 실행시에 필요하다면
	필요한 값을 전달할 수 있다.
	이렇게 전달하는 값은 main메서드의 매개변수 배열로 전달됨
	전달한 것 만큼 배열의 크기가 정해지고
	차례대로 0번째 요소부터 쌓이게 된다.

	java DivTest 4 2
*/

class  DivTest
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int result = a/b;
		System.out.println("결과: " + result);
	}
}
