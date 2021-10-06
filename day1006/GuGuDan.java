class  GuGuDan
{
	public static void main(String[] args) 
	{
		int dan = 1;
		while(dan <= 9){
			System.out.printf("*** %d´Ü ***%n", dan);
			int j = 1;
			while(j <= 9){
				System.out.printf("%d*%d=%d%n", dan, j, dan*j);
				j++;
			}
			System.out.println();
			dan++;
		}
	}
}
