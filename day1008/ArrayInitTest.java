class ArrayInitTest 
{	
	
	static void init(double[] values){
		for(int i = 0; i < values.length; i++){//5
			values[i] = 0;
		}	
	}
	
	static void printArray(double[] data){
		for(double i : data){
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		double[] arr = {5.7, 10.2, 11.4, 12.2, 15.8};

		printArray(arr);
		init(arr);
		printArray(arr);
	}
}
