//����Ŭ�������� 
//������ ���� �Ѱ��� �Ű������� ���޹޾� ���ϱ� 1�Ͽ� �ٽ� ������ �����ϰ� ����ϴ� �޼���
class CallByValueTest 
{	
	public static void plusOne(int n){
		n += 1;
		System.out.println(n);
	}
	public static void main(String[] args) 
	{
		int data = 100;
		plusOne(data);
		System.out.println(data);
	}
}
