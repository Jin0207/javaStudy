import java.util.Scanner;
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
				}
			}
		}else{
			flag = false;
		}
		return flag;
	}
}
class  MethodTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++){
			System.out.printf("a�� %d��° ���� �Է��ϼ���:", i+1);
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < b.length; i++){
			System.out.printf("b�� %d��° ���� �Է��ϼ���:", i+1);
			b[i] = sc.nextInt();
		}

		MyUtil mu = new MyUtil();
		boolean flag = true;
		flag = mu.comparisonArray(a,b);

		if(flag){
			System.out.print("�迭�� ��Ұ� ��ġ�մϴ�.");
		}else{
			System.out.print("�迭�� ��Ұ� ��ġ�����ʽ��ϴ�..");
		}
	}
}
