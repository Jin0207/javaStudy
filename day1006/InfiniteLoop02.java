class  InfiniteLoop02
{
	public static void main(String[] args) 
	{	
		int i = 1;
		for(;;){//무한반복 ()안 무한 true
			System.out.println("hello");
			if(i >= 3){ //조건식을 통해 for문 종료
				break;
			}//end if
			i++;
		}//end for
	}
}
