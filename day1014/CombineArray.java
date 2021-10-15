/*정수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메서드
  실수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메서드 
  중복정의하고 실험
 */
class CombineArray
{
	public static int[] combine(int[] data, int[] arr){
		int[] cb = new int[data.length + arr.length];
		for(int i = 0; i < data.length; i++){
			cb[i] = data[i];
		}
		
		for(int i = 0; i < arr.length; i++){
			cb[i + data.length] = arr[i];
		}
		return cb;
	}

	public static double[] combine(double[] data, double[] arr){
		double[] cb = new double[data.length + arr.length];

		for(int i = 0; i < data.length; i++){
			cb[i] = data[i];
		}
		
		for(int i = 0; i < arr.length; i++){
			cb[i+(data.length)] = arr[i];
		}
		return cb;
	}

	public static void printArray(int[] data){
		for(int i = 0; i < data.length; i++){
			System.out.printf("%10d", data[i]);
		}
		System.out.println();
	}

	public static void printArray(double[] data){
		for(int i = 0; i < data.length; i++){
			System.out.printf("%10.1f", data[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int[] data = { 11, 25, 26, 26};
		int[] arr = {1, 2, 3}; 
		double[] fData = {2.0, 3.0};
		double[] fArr = {1.8, 2.9, 3.6}; 

		printArray(combine(data, arr));
		printArray(combine(fData, fArr));


	}
}
