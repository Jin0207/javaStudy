class SistUtil
{
	public static void max(double a, double b){
		double max = a;
		if(b>max){ 
			max = b;
		}
		System.out.println("두 수 중에 큰 값은 " + max);
	}
}

class MethodOverloadingTest04{
	public static void main(String[] args){
		SistUtil.max(5,6);
		SistUtil.max(7.4,8.9);
	}
}
