class SwapTest 
{
	public static void main(String[] args) 
	{
		String cup1 = "Ŀ??";
		String cup2 = "????";

		System.out.println("??1: " + cup1);
		System.out.println("??2: " + cup2);
		
		String tmp = cup1;
		cup1 = cup2;
		cup2 = tmp;

		System.out.println("?ΰ??? ???? ?????? ???? ?ٲپ????ϴ?.");
		System.out.println("??1: " + cup1);
		System.out.println("??2: " + cup2);
	}
}
