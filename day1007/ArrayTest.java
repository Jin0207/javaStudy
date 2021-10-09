class  ArrayTest
{
	public static void main(String[] args) 
	{
		/*
		int[] a; //정수형배열을 가리킬 변수a를 선언, 어느 배열을 가리킬지 안정했기에 오류발생
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
		System.out.println(b[0]); //배열이 생성될때 각 요소 자동초기화
		System.out.println(c[0]);
		System.out.println(d[0]);
		System.out.println(e[0]);
		
	}
}
