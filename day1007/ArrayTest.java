class  ArrayTest
{
	public static void main(String[] args) 
	{
		/*
		int[] a; //�������迭�� ����ų ����a�� ����, ��� �迭�� ����ų�� �����߱⿡ �����߻�
		a[0] = 5; 
		*/

		int[] a;
		a = new int[5];

		int[] b = new int[5];
		boolean[] c = new boolean[5];
		double[] d = new double[5];
		String[] e = new String[5];

		a[0] = 100;

		System.out.println(a[0]);
		System.out.println(b[0]); //�迭�� �����ɶ� �� ��� �ڵ��ʱ�ȭ
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);
		
	}
}
