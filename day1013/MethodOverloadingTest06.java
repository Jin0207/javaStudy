//������ �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼���
//�Ǽ��� �迭�� �Ű������� ���޹޾� ������ ���Ͽ� ��ȯ�ϴ� �޼���
//�� �޼��带 �ߺ��Ͽ� �����ϰ� ȣ���Ѵ�.
class MyUtil
{
	/*
	public static int getSum(int[] arr){
		int tot = 0;
		for(int i = 0; i < arr.length; i++){
			tot += arr[i];
		}
		return tot;
	}
	*/
	public static int getSum(int[] arr){
		int tot = 0;
		for(int i : data){
			tot += i;
		}
		return tot;
	}
	public static double getSum(double[] arr){
		double tot = 0;
		for(int i = 0; i < arr.length; i++){
			tot += arr[i];
		}
		return tot;
	}
}
class MethodOverloadingTest06 
{
	public static void main(String[] args) 
	{
		int[] arr = {1, 2, 3, 4};
		double[] darr = {2.6, 2.7, 3.8};

		System.out.println(MyUtil.getSum(arr));
		System.out.println(MyUtil.getSum(darr));
	}
}
