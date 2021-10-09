class  ArrayIndexTest
{
	public static void main(String[] args) 
	{
		int[] arr = new int[5]; //사용할 수 있는 인덱스의 범위: 0 ~ 4
		
		System.out.println(arr[5]);
	}
}
/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at ArrayIndexTest.main(ArrayIndexTest.java:7)
		예외 -- 인덱스 범위를 넘었습니다.*/