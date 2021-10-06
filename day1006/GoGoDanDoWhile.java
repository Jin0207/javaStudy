//do~while문 구구단출력하는 프로그램

class  GoGoDanDoWhile
{
	public static void main(String[] args) 
	{
		int dan = 2;
		do{
			System.out.printf("%d단%n",i);
			int j = 1;
			do{
				System.out.printf("%d * %d = %d%n",dan,j,dan*j);
				j++;
			}while(j <= 9);
			dan++;
			System.out.println();
		}while(i <= 9);
	}
}
