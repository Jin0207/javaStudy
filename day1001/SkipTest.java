// 1부터 3씩 건너뛰면서 정수 값 출력 -for문 1,4,7,10,13..
class  SkipForTest
{
	public static void main(String[] args) 
	{
		for(int i = 1; i < 101; i += 3){
			if(i == 1){
				System.out.print(i);
			}else{
				System.out.print(", " + i);
			}
			
		}
	}
}
