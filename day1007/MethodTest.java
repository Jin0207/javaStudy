class MyUtil
{
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��Ҹ� ��� ����ϴ� �޼��带 ����
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