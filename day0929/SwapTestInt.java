class SwapTestInt  
{
	public static void main(String[] args) 
	{
		int a = 3;//00011
		int b = 4;//00100

		System.out.println("a= " + a);
		System.out.println("b= " + b);
	
		/*int tmp = a;
		a = b;
		b = tmp;*/
		//���� �ΰ��� �¹ٲܶ� �ӽú��� ���� �¹ٲٴ� ��� --��Ʈ�������̿�

		a = a^b; //00111
		b = b^a; //00100 00011
		a = a^b; //      00111  00100

		System.out.println("a�� b�� ���� ���� �ٲپ����ϴ�.");
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
	}
}