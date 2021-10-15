//정수형 변수 n 을 전달받아
//1~ n까지의 합을 누적하여 반환하는 메서드를
//재귀호출을 이용하여 정의하고 실험해본다
class  RecursiveMethodTest02
{
	public static int getOmit(int n){
		if(n == 1){
			return 1;
		}
		return n + getOmit(n -1);
	}
	public static void main(String[] args) 
	{
		System.out.println(getOmit(4));
	}
}
