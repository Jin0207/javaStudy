class  RecursiveMethodTest
{
	//n�� �Ű������� ���޹޾� n!�� ���Ͽ� ��ȯ�ϴ� �޼��带 ���ȣ���� �̿��Ͽ� ����
	public static int getFactorial(int n){
		if(n == 1){
			return 1;
		}
		return n * getFactorial(n-1);
	}
	public static void main(String[] args) 
	{
		System.out.printf("5! = %5d%n", getFactorial(3));
		System.out.printf("10! = %5d%n", getFactorial(10));
	}
}
