//로또 ( 1 ~ 45)의 숫자 6개를 말해 봅니다.

class LoopArray 
{
	public static void main(String[] args) 
	{
		int[] lotto = {4, 11, 19, 26, 27, 43}; //21
		
		for( int i = 0; i < lotto.length; i++){
			System.out.print(lotto[i] + " ");
		}
	}
}
