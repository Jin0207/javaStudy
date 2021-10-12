class Person
{
	private String name;
	private int age;

	public int getAge(){
		return age;
	}
	public void setAge(int a){
		age = a;
		//return;
	}
	
	public void setName(String n){
		name = n;
		//return;
	}
	public String getName(){
		return name;
	}
}

class PersonTest02 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(25);

		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
	}
}
