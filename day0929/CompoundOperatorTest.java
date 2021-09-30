class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;

		//for(i = 1;i <= 3; i++){
		for(i = 1;i <= 100; i++){
			sum += i;
		}
		System.out.print(i + "," + sum);
		/*
		sum += i; //1
		i++;
		sum += i;
		i++;
		sum += i;
		System.out.print(i + "," + sum);
		*/
	}
}
