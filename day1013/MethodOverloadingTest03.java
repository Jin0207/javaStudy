class SistUtil
{
	public static void max(int a, int b){
		max((double)a, (double)b); //�޼���ȿ� �޼��带 ȣ�� �ٵ� �Ű���������ȯ�ؼ�ȣ��
	}

	public static void max(double a, double b){
		double max = a;
		if(b>max){ 
			max = b;
		}

		System.out.println("�� �� �߿� ū ���� " + max);
	}

}
class MethodOverloadingTest03{
	public static void main(String[] args){
		SistUtil.max(5,6);
		SistUtil.max(7.4,8.9);
	}
}
