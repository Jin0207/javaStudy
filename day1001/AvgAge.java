//5명의 나이를 배열에 넣어 평균나이를 구하자

class  AvgAge
{
	public static void main(String[] args) 
	{
		int[] age = { 27, 28, 26, 29, 28};

		int tot = 0;
		double avg = 0;

		for(int i = 0; i < age.length; i++){
			tot += age[i];
		}
		
		avg = (double)tot / age.length; // 정수 / 정수 = 정수 -> 형변환해주어 소수점아래도 출력하자
		System.out.print("평균 나이: " + avg);
	}
}
