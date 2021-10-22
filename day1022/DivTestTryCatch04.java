//메세지를 잘 못알아 듣는다면?
//세분화한 catch로 작성한다
//단, is a 관계라면 범위가 작은 Exeption먼저 catch문을 작성
/*
범위가 큰게 먼저오면 오류 발생
DivTestTryCatch04.java:15: error: exception ArithmeticException has already been caught
                }catch(ArithmeticException e){
*/
class  DivTestTryCatch04
{
	public static void main(String[] args) 
	{
		try{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int result = a/b;
			System.out.println("결과: " + result);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수는 없어요!");
		}catch(Exception e){
			System.out.println("두번째수가 0이 아닌 두개의 숫자를 실행 시, 전달해 주세요");
		}

	}
}
