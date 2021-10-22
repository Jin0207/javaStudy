//ArithmeticException에 대한 예외처리도 추가해본다.

class  DivTestTryCatch02
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과: " + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 시에 나누기할 두 수를 입력하세요!");
		}catch(ArithmeticException e){
			System.out.println("실행 시에 나누기할 수가 0은 올 수 없어요!");
		}catch(NumberFormatException e){
			System.out.println("실행 시에 문자로 입력하면 실행할 수 없어요");
		}

	}
}
/*
Exception in thread "main" java.lang.NumberFormatException: For input string: "사"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
        at java.base/java.lang.Integer.parseInt(Integer.java:652)
        at java.base/java.lang.Integer.parseInt(Integer.java:770)
        at DivTestTryCatch02.main(DivTestTryCatch02.java:8)
*/