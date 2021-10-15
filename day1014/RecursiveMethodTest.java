class  RecursiveMethodTest
{
	//n을 매개변수로 전달받아 n!를 구하여 반환하는 메서드를 재귀호출을 이용하여 정의
	public static int getFactorial(int n){
		if(n == 1){
			return 1;
		}
		return n * getFactorial(n-1);
	}
	public static void main(String[] args) 
	{
		System.out.printf("5! = %5d%n", getFactorial(3));
		System.out.printf("10! = %5d%n", getFactorial(10));
	}
}
