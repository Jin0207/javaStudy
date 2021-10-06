//구구단 출력 : 2단부터 9단까지 출력

class Programming14 
{
	public static void main(String[] args) 
	{
		for(int dan = 2; dan <= 9; dan++){
			System.out.println( "*** " + dan + "단 ***");
			for(int i = 1; i <= 9; i++){
				System.out.println( dan + "*" + i + " = " + dan * i);
			}//end for i
			System.out.println();
		}//end for dan
	}//end main
}//end class
