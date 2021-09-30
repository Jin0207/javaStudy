class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27; //대입연산자, 오른쪽을 먼저 수행한후 왼쪽에 저장(대입)한다.
		System.out.println("임상진의 나이: " + age + "살 입니다.");

		//float height; 
		double height = 173.8;
		//height = 173.8; //에러 -- 값손실이 일어날 수 있다
		//height = 173.8f; //에러해결방안 1 -- 실수값을 float변수에 저장하기 위해서는 접미사 f를 붙혀 저장
		//height = (float)173.8;//에러해결방안 2 --4바이트로 바꿔서 출력하겟다 자료형변환을 하여 저장
		System.out.println("임상진의 키: " + height);

		char gender;
		gender = 'M';
		//gender = "M"; -error! 쌍따옴표로 묶으면 문자열
		System.out.println("임상진의 성별: " + gender );

		boolean isVaccine;
		isVaccine = true;
		System.out.println("임상진의 1차백신 접종여부 : " + isVaccine);
	}
}
/*
DataTypeTest.java:14: error: incompatible types: possible lossy conversion from double to float
                height = 173.8;
				타입이 안맞는다 incompatible
				*/
/*
DataTypeTest.java:21: error: incompatible types: String cannot be converted to char
                gender = "M";
				쌍따옴표로 묶으면 문자열로 취급하기에 char에 저장할수없다
                         ^
*/