class  Exam02_CallByValueTest
{
	//������ ���� �ϳ��� �Ű������� ���޹޾� -1�� �Ͽ� ����ϴ� �޼��带 ����
	public static void minusOne(int n){
		n -= 1;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		int n = 5;
		minusOne(n);
		System.out.println(n);

	}
}
