class Person
{
	String name;
	int age;
	char gender;

	void eat(String food){
		System.out.printf("������ %c�� %d�� %s��(��) %s�� �Ծ��%n", gender, age, name, food);
	}

	void sleep(){
		System.out.printf("������ %c�� %d�� %s��(��) ��~��~ �ڰ� �־��%n", gender, age, name);
	}
}
class PersonTest 
{
	public static void main(String[] args) 
	{
		Person p;
		p = new Person();

		p.name = "�ӻ���";
		p.age = 27;
		p.gender = '��';

		p.eat("�Ұ��");
		p.sleep();

	}
}
