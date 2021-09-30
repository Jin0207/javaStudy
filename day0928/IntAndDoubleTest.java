class IntAndDoubleTest 
{
	public static void main(String[] args) 
	{
		/*정수와 정수를 연산하면 결과 = 정수
		만약 정수와 정수를 연산하여 실수값을 갖기를 원한다면
		정수 중 하나를 실수로 형변환하여 연산해야한다.*/

		int a = 5; //변수초기화한다
		int b = 2; //처음값을 넣는다 --초기화한다 

		double result;
		result = (double)a/b;
		System.out.println("나누기 결과:" + result);
	}
}
