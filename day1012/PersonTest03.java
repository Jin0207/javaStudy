class Person
{
	private String name;
	private int age;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setName(String name){
		//name = name; // �Ű����� = �Ű�����
		this.name = name;
	}
	public String getName(){
		return name;
	}
}
class PersonTest03 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(20);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
