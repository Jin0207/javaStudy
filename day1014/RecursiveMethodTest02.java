//������ ���� n �� ���޹޾�
//1~ n������ ���� �����Ͽ� ��ȯ�ϴ� �޼��带
//���ȣ���� �̿��Ͽ� �����ϰ� �����غ���
class  RecursiveMethodTest02
{
	public static int getOmit(int n){
		if(n == 1){
			return 1;
		}
		return n + getOmit(n -1);
	}
	public static void main(String[] args) 
	{
		System.out.println(getOmit(4));
	}
}
