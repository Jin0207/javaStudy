//구구단 출력 : 2단부터 9단까지 출력

class Programming14 
{
	public static void main(String[] args) 
	{
		for(int i = 2; i <= 9; i++){
			for(int k = 1; k <= 9; k++){
				System.out.println( i + "*" + k + " = " + i * k);
			}
		}
	}
}
