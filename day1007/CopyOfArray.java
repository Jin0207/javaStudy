import java.util.Arrays;
class CopyOfArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1, 2, 3, 4, 5};
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++){
			b[i] = a[i]; //���� �����ϰ� ����
		}

		//b = a; �����Ͱ����簡�ƴ� �������ּҸ� �����ϰ��ִ°���
		a[0] = 100;
		
		for(int i : b){
			System.out.printf("%5d",i);
		}

		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.print(Arrays.toString(a));


	}
}
