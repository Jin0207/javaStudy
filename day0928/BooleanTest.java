class BooleanTest 
{
	public static void main(String[] args) 
	{
		/* boolean 자료형의 변수에는
		참인 상태인 true와 거짓인 상태의 false인 논리값을 저장할 수 있다.
		true,false 값을 직접 저장할 수도 있고
		어떠한 비교연산의 결과를 저장할 수 도 있다.*/
		boolean flag;
		//flag = true;
		int age = 16;
		flag = age >= 20; //비교연산 age의 값에 따라서 참일수도 거짓일수도 잇음
		System.out.println(flag);
	}
}
