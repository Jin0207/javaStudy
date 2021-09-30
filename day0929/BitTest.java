
class  BitTest
{
	public static void main(String[] args) 
	{
		int a = 10; //00001010
		int b = 20; //00010100
		int i = a & b; //00000000 //0
		int j = a | b;  //00011110 //30
		int k = a ^ b;//00011110 //30

		System.out.println("i=" + i);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
	}
}
