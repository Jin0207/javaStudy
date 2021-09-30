class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		/*자바에서는 단일문자의 처리와 문자열으 ㅣ차리가 다름
		하나의 문자를 표현하기 위해서는 ''로 묶어야하고
		문자열을 처리하기 위해서는 " "로 묶어야한다.*/

		/* 만약 하나의 문자이지만 ""로 묶었다면 char에 저장할 수없고
		   string으로 저장해야한다.*/

		char firstName; //변수선언
		firstName = '박';
		System.out.println(firstName);

		String name;
		name = "박성미";
		System.out.println(name);
		/*
		char lastName;
		lastName = "미";
		System.out.println(lastName);
		--CharAndStringTest.java:21: error: incompatible types: String cannot be converted to char
                lastName = "미";  string을 char에다가 저장할 수 없음
		*/

		String lastName;
		lastName = "미";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt은 string의 인덱스값으로 문자 하나를 알려주는 기능
		System.out.println("맨마지막에 있는 문자는 " + last + "입니다");
	}
}


