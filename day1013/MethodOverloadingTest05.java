class MyUtil
{
	public static int max(int a, int b){
		int result = a;
		if(b>a)
			result = b;
		return result;
	}
	/*
	public static int max(int a, int b, int c){
		int result = this(a,b);
		result = max(result, c);
		return result;
	}
	*/
	public static int max( int a, int b, int c){
		return max( max(a,b) , 3);
	}
	public static int max(int a, int b, int c, int d){
		return max( max(a,b,c) , d);
	}
}
class MethodOverloadingTest05 
{
	public static void main(String[] args) 
	{
		System.out.println(MyUtil.max(1,2));
		System.out.println(MyUtil.max(1,2,3));
		System.out.println(MyUtil.max(1,2,3,4));
	}
}
