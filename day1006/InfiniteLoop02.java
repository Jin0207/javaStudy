class  InfiniteLoop02
{
	public static void main(String[] args) 
	{	
		int i = 1;
		for(;;){//���ѹݺ� ()�� ���� true
			System.out.println("hello");
			if(i >= 3){ //���ǽ��� ���� for�� ����
				break;
			}//end if
			i++;
		}//end for
	}
}
