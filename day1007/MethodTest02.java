class MyUtil
{
	//�ι迭 �Ű�����, �ι迭�� ���� �����Ѱ����� �����Ǿ��ִ��� �����ȯ �޼������� ȣ��
	boolean comparisonArray(int[] a, int[] b){
		boolean flag = true;
		if( a.length == b.length){
			for(int i = 0; i < a.length; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}//end if
			}//end for
		}else{
			flag = false;
		}
		return flag;
	}
}
class  MethodTest02
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 40, 80};
		int[] b = {10, 20, 30, 80};

		MyUtil mu = new MyUtil();

		if(mu.comparisonArray(a,b)){
			System.out.print("�迭�� ��Ұ� ��ġ�մϴ�.");
		}else{
			System.out.print("�迭�� ��Ұ� ��ġ�����ʽ��ϴ�..");
		}
	}
}
