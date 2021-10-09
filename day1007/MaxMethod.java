//두개의 정수를 매개변수로 전달받아
//그 중에 큰수를 찾아 반환하는 메서드를 만들고
//그 메소드를 호출하기

class MyMath
{
	int getMax(int a, int b){ //메소드로부터 무언갈 가져올때 메서드의 이름을 대개 get으로 시작함
		int max = a;
		if(b > max){
			max = b;
		}
		
		return max;
	}
}

class MaxMethod 
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 7;
		int result;
		MyMath mm = new MyMath();

		result = mm.getMax(a, b);
		System.out.println(result);
	}
}