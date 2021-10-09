import java.util.Arrays;
class CopyOfArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++){
			b[i] = a[i]; //값을 복사하고 있음
		}

		//b = a; 데이터값복사가아닌 데이터주소를 전달하고있는거임
		a[0] = 100;
		
		for(int i : b){
			System.out.printf("%5d",i);
		}

		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.print(Arrays.toString(a));


	}
}
