class ThreeDimensionArrayTest 
{
	public static void main(String[] args) 
	{
		int[][][] a = new int[2][3][4];


		for(int i = 0; i < 2; i++){
			System.out.println(i+1 + "ёй");
			for(int j = 0; j < 3; j++){
				System.out.print(j+1 + "За");
				for(int k = 0; k <4; k++){
					a[i][j][k] = i+1;
					System.out.printf("%5d", a[i][j][k]);
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
