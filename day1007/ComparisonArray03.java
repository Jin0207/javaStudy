import java.util.Arrays;

class  ComparisonArray03
{
	public static void main(String[] args) 
	{
		int[] a = { 1, 2, 3, 4, 5};
		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8};
	
		boolean flag = true;
		if(a.length == b.length){
			for(int i = 0; i < b.length; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}
			}
		}else{
			flag = false;

		
		
		if(flag){
			System.out.print("�迭�� ��Ұ� ��ġ�մϴ�.");
		}else{
			
			System.out.print("�迭�� ��Ұ� ��ġ���� �ʽ��ϴ�.");
		}
		
		
	}
}
