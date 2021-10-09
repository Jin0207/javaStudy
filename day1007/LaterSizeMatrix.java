class  LaterSizeMatrix
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[3][4];

		int n = 1;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				a[i][j] = n++;
				System.out.printf("%5d", a[i][j]);
			}
			System.out.println();
		}

	}
}
