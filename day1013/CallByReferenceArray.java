//정수형 배열을 매개변수로 전달받아
//배열의 모든 요소를 1씩 증가하는 메서드를 정의하세요
//정수형 배열을 매개변수로 전달받아
//배열의 모든 요소를 출력하는 메서드를 정의
class CallByReferenceArray 
{	
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.printf("%5d", arr[i]);
		}
		System.out.println();
	}
	
	public static void plusOne(int[] arr){
		for(int i = 0; i < arr.length; i++){
			arr[i] += 1;
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = { 25, 30, 31, 32, 45};
		printArray(arr);
		plusOne(arr);
		printArray(arr);
	}
}
