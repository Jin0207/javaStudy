class MyUtil
{
	//두배열 매개변수, 두배열이 서로 동일한값으로 구성되어있는지 결과반환 메서드정의 호출
	boolean comparisonArray(int[] a, int[] b){
		boolean flag = true;
		if( a.length == b.length){
			for(int i = 0; i < a.length; i++){
				if(a[i] != b[i]){
					flag = false;
					break;
				}//end if
			}//end for
		}else{
			flag = false;
		}
		return flag;
	}
}
class  MethodTest02
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 40, 80};
		int[] b = {10, 20, 30, 80};

		MyUtil mu = new MyUtil();

		if(mu.comparisonArray(a,b)){
			System.out.print("배열의 요소가 일치합니다.");
		}else{
			System.out.print("배열의 요소가 일치하지않습니다..");
		}
	}
}
