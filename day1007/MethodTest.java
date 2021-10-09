class MyUtil
{
	//정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메서드를 정의
	void printArray(int[] data){
		for(int i: data){
			System.out.printf("%5d",i);
		}
		System.out.println();
	}
}
class  MethodTest
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30, 40, 50};
		int[] b = {60, 70, 80, 90, 100};

		MyUtil mu = new MyUtil();
		mu.printArray(a);
		mu.printArray(b);
	}
}
