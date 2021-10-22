/*실제 프로그램의 일처리를 위한 핵심 코드는 4줄이나
	예외처리를 하다보니 코드가 길어짐
	이런 경우, 모든 예외의 조상클래스인 Exception하나만으로 처리할수있다
	굳이 세분화할 필요가없다면!
*/

class  DivTestTryCatch03
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과: " + result);
		}catch(Exception e){
			System.out.println("두번째수가 0이 아닌 두개의 숫자를 실행 시, 전달해 주세요");
		}

	}
}
