class Emp
{
	private String name;
	private int sal;
	private String addr;

	public String toString(){
		return "�̸�: " + name + ", �޿�: " + sal + ", �ּ�: " + addr;
	}

	public Emp(){
		name  = "ȫ�浿";
		sal = 500;
		addr = "����";
	}

	public Emp(String name, int sal, String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}

	public Emp(String name){
		this.name = name;
		sal = 500;
		addr = "����";
	}

	public Emp(String name, int sal){
		this.name = name;
		this.sal = sal;
		addr = "����";
	}

	public Emp(int sal, String name){
		this.sal = sal;
		this.name = name;
		this.addr = "����";
	}

}
class ConstructorOverloading02
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp("�̼���", 300, "����");
		Emp e3 = new Emp("�谩��");
		Emp e4 = new Emp("������", 800);
		Emp e5 = new Emp(900, "����");


		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	
	}
}
