
class  DivTestTryCatch
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			//전달받을게 없을때 new ArrayIndexOutOfBoundsException이 생성이됨
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과: " + result);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("실행 시에 나누기할 두 수를 입력하세요!");
		}

	}
}

/*또다른 예외발생
C:\javaStudy\day1022>java DivTestTryCatch 4 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivTestTryCatch.main(DivTestTryCatch.java:23)
*/