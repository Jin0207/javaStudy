class SwapTestInt  
{
	public static void main(String[] args) 
	{
		int a = 3;//00011
		int b = 4;//00100

		System.out.println("a= " + a);
		System.out.println("b= " + b);
	
		/*int tmp = a;
		a = b;
		b = tmp;*/
		//정수 두개를 맞바꿀때 임시변수 없이 맞바꾸는 방법 --비트연산자이용

		a = a^b; //00111
		b = b^a; //00100 00011
		a = a^b; //      00111  00100

		System.out.println("a와 b의 값을 서로 바꾸었습니다.");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
	}
}
