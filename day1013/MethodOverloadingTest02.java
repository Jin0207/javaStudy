class SistUtil
{
	public static void max(int a, int b){
		int max = 0;
		max = (a>b)? a : b;
		System.out.println("두 수 중에 큰 값은 " + max);
	}

	public static void max(double a, double b){
		double max = a;
		if(b>max){ 
			max = b;
		}

		System.out.println("두 수 중에 큰 값은 " + max);
	}

}
class MethodOverloadingTest02 
{
	public static void main(String[] args) 
	{
		SistUtil.max(5,6);
		SistUtil.max(7.4,8.9);
	}
}
