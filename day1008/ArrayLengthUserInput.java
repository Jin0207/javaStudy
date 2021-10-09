import java.util.Scanner;
class  ArrayLengthUserInput
{
	static void printArray(double[] data){
		for(double i : data){
			System.out.printf("%10.1f", i);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double[] readings;
		int n;
		System.out.print("배열의 크기를 입력하세요.:");
		n = sc.nextInt();
		readings = new double[n];
		
		for(int i = 0; i < n; i++){
			System.out.printf("%d번째 값을 입력하세요 :" ,i+1);
			readings[i] = sc.nextDouble();
		}

		printArray(readings); //같은 클래스에 메서드를 작성하여ㅓㅆ고 그 메서드는 static이기에
		                      //객체생성필요없음
	}
}
