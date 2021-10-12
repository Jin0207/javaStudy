class Person
{
	private String name;
	private int age;
	public Person(){
		name = "김유신";
		age = 20;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
}
class  ConstructorTest
{
	public static void main(String[] args) 
	{
		Person kim = new Person(); //객체생성과 동시에 생성자 실행됨
		System.out.println(kim.getName() + kim.getAge());
		//김유신 20 출력됨
		kim.setName("이순신");
		kim.setAge(35);
		System.out.println(kim.getName() + kim.getAge());
	}
}
