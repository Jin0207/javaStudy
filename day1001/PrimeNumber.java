// 2~100 ��� �Ҽ� ���
class  PrimeNumber
{
	public static void main(String[] args) 
	{	
		int i, j;
		for(i = 2; i <= 100; i++){
			if( i == 2){
					System.out.print("�Ҽ�: " + i);
			}
			else{
				for(j = 2; j < i; j++){			
					if( i % j == 0){
						break;
					}
					
				}
				if(j == i){
					System.out.print(", " + i);
				}
			}
		}
	
	}
}
