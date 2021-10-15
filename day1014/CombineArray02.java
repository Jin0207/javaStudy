/*정수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메서드
  실수형 배열 2개를 매개변수로 전달받아 하나의 배열로 만들어 반환하는 메서드 
  중복정의하고 실험
 */
class MyUtil
{
	public static int[] unionArray(int[] a, int[] b){
		int[] result = new int[ a.length + b.length ];

		int i;
		for(i = 0; i < a.length; i++){
			result[i] = a[i];
		}
		for(int j = 0; j < b.length; j++){
			/*
			result[i] = b[j];
			i++;
			*/
			result[i++] = b[j];
		}
		return result;
	}

	public static double[] unionArray(double[] a, double[] b){
		double[] result = new double[a.length + b.length];

		int i;
		for(i = 0; i < a.length; i++){
			result[i] = a[i];
		}
		for(int j = 0; j < b.length; j++){
			result[i++] = b[j];
		}
		return result;
	}

	public static void printArray(int[] arr){
		for(int i : arr){
			System.out.printf("%10d", i);
		}
		System.out.println();
	}
	public static void printArray(double[] arr){
		for(double i : arr){
			System.out.printf("%10.1f", i);
		}
		System.out.println();
	}
}

class CombineArray02
{
	public static void main(String[] args) 
	{
		int[] data = { 11, 25, 26, 26};
		int[] arr = {1, 2, 3}; 

		double[] fData = {2.0, 3.0};
		double[] fArr = {1.8, 2.9, 3.6}; 
		
		int[] arr1 = MyUtil.unionArray(data,arr);
		double[] arr2 = MyUtil.unionArray(fData, fArr);

		MyUtil.printArray(arr1);
		MyUtil.printArray(arr2);

	}
}

