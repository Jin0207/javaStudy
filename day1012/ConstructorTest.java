class Person
{
	private String name;
	private int age;
	public Person(){
		name = "������";
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
		Person kim = new Person(); //��ü������ ���ÿ� ������ �����
		System.out.println(kim.getName() + kim.getAge());
		//������ 20 ��µ�
		kim.setName("�̼���");
		kim.setAge(35);
		System.out.println(kim.getName() + kim.getAge());
	}
}
