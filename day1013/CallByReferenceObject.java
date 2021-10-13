class Person
{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public Person(){
	}
	public String toString(){
		return name + ", " + age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
class CallByReferenceObject 
{
	//Person 객체를 매개변수로 전달받아 그 사람으 ㅣ나이를 1증가하는 메서드
	public static void plusOne(Person p){
		p.setAge(p.getAge() + 1);
	}
	public static void main(String[] args) 
	{
		Person p = new Person("홍길동", 20);
		System.out.println(p);
		plusOne(p);
		System.out.println(p);
	}
}
