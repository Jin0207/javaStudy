import java.util.Scanner;
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
				}
			}
		}else{
			flag = false;
		}
		return flag;
	}
}
class  MethodTest03
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i = 0; i < a.length; i++){
			System.out.printf("a의 %d번째 값을 입력하세요:", i+1);
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < b.length; i++){
			System.out.printf("b의 %d번째 값을 입력하세요:", i+1);
			b[i] = sc.nextInt();
		}

		MyUtil mu = new MyUtil();
		boolean flag = true;
		flag = mu.comparisonArray(a,b);

		if(flag){
			System.out.print("배열의 요소가 일치합니다.");
		}else{
			System.out.print("배열의 요소가 일치하지않습니다..");
		}
	}
}
