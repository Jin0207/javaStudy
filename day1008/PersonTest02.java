class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		System.out.printf("성별이 %c인 %d살 %s가(이) %s를 먹어요%n", gender, age, name, food);
	}

	void sleep(){
		System.out.printf("성별이 %c인 %d살 %s가(이) 쿨~쿨~ 자고 있어요%n", gender, age, name);
	}
}
class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p;
		p = new Person();
		p.name = "임상진";
		p.age = 27;
		p.gender = '남';
		p.eat("소고기");
		p.sleep();

		Person e = new Person();
		e.name = "북이";
		e.age = 28;
		e.gender = '여';
		e.eat("피콜");
		e.sleep();

	}
}
