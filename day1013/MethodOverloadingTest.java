class SistUtil
{
	public void max(int a, int b){
		int max = 0;
		max = (a>b)? a : b;
		System.out.println("�� �� �߿� ū ���� " + max);
	}

	public void max(double a, double b){
		double max = a;
		if(b>max){ 
			max = b;
		}

		System.out.println("�� �� �߿� ū ���� " + max);
	}

}
class MethodOverloadingTest 
{
	public static void main(String[] args) 
	{
		SistUtil su = new SistUtil();
		su.max(5,6);
		su.max(7.4,8.9);
	}
}
