// 1���� 3�� �ǳʶٸ鼭 ���� �� ��� -for�� 1,4,7,10,13..
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
