// 2~100 모든 소수 출력
class  PrimeNumber
{
	public static void main(String[] args) 
	{	
		int i, j;
		for(i = 2; i <= 100; i++){
			if( i == 2){
					System.out.print("소수: " + i);
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
