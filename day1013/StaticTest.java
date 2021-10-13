class Family
{
	private String name;
	private int age;
	private String role;
	public static String addr;

	public Family(String name, int age, String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public Family(){
	}

	public String toString(){
		return "[name : " + name + ", age: " + age + ", role: " + role + ", addr: " + addr + "]";
	}
}

class StaticTest 
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";
		System.out.println("주소: " + Family.addr);
	}
}
