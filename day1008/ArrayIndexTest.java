class  ArrayIndexTest
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5]; //����� �� �ִ� �ε����� ����: 0 ~ 4
		
		System.out.println(arr[5]);
	}
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexTest.main(ArrayIndexTest.java:7)
		���� -- �ε��� ������ �Ѿ����ϴ�.*/