class  AbsoluteValue
{
	static int abs(int value){
		return Math.abs(value);
	}
	
	public static void main(String[] args) 
	{
		int value = 5;
		System.out.println(value + "�� ���밪: " + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪: " + abs(value));

	}
}