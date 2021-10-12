class Preson
{
	String name;
	int age;
}
class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p1;
		p1 = new Person(); //참조변수 p1이 새로운 Person객체를 참조한다
		
		p1.name = "홍길동";
		p1.age = 25;
	}
}
