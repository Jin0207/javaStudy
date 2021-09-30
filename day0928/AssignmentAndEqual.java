class AssignmentAndEqual 
{
	public static void main(String[] args) 
	{
		//자바프로그램에서는 대입(assign)연산자와
		//같은지 비교(equal)의 연산자가 다르다.
		// = 은 대입을 위한 연산자이고
		// == 은 같은지 비교하는 연산자 

		int age;
		boolean flag;

		age = 20; //대입연산자
		flag = age == 20; // 대입연산자 실행 - 오른쪽 -> 왼쪽에 대입
		//age == 20 age와 20이 같은지 boolean값으로 저장

		System.out.println(flag);
	}
}
