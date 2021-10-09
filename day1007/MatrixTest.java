class MatrixTest 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[5][3];//5Çà 3¿­ ÃÑ 15°³
		
		int n = 1;
		for(int i = 0; i <5; i++){
			for(int j = 0; j < 3; j++){
				a[i][j] = n++;
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}

	}
}
