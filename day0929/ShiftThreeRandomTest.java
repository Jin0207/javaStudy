import java.util.Random;

class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt(); //Int의 범위 안에서 한 개의 정수를 무작위로 뽑아줌
		System.out.println(n);
		// 0에서 9사이의 난수가 발생하도록
		n = n >>> 1;
		n = n % 10;
		System.out.println(n);
	}
}
