class IncrementDecrement 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++;
		++j;
		System.out.println(i);
		System.out.println(j);

		System.out.println("----------------------");
		//a++�� a+1�� �ٸ���
		int a = 10;
		int b = 10;
		System.out.println(a+1); //a�ڽ��� �������ʴ´�
		System.out.println(b++); //b+1�� �ؼ� b�� �����Ѵ�, b�� ���� �����Ѵ�
		System.out.println("----------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("----------------------");

		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("----------------------");

		i = 5;
		j = 5;
		a = ++i; // a=6, i=6
		b = j++; //b=5, j=6
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("----------------------");

		i = 5;
		j = 5;
		int k = 5;
		System.out.println(++i);//6
		System.out.println(j++);//5
		System.out.println(k+1);//6
		System.out.println("i = " + i);//6
		System.out.println("j = " + j);//6
		System.out.println("k = " + k);//5

	}
}
