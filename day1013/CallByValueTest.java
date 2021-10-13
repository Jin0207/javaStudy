//같은클래스내에 
//정수형 변수 한개를 매개변수로 전달받아 더하기 1하여 다시 변수에 저장하고 출력하는 메서드
class CallByValueTest 
{	
	public static void plusOne(int n){
		n += 1;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		int data = 100;
		plusOne(data);
		System.out.println(data);
	}
}
