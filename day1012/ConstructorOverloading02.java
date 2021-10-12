class Emp
{
	private String name;
	private int sal;
	private String addr;

	public String toString(){
		return "이름: " + name + ", 급여: " + sal + ", 주소: " + addr;
	}

	public Emp(){
		name  = "홍길동";
		sal = 500;
		addr = "서울";
	}

	public Emp(String name, int sal, String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}

	public Emp(String name){
		this.name = name;
		sal = 500;
		addr = "서울";
	}

	public Emp(String name, int sal){
		this.name = name;
		this.sal = sal;
		addr = "서울";
	}

	public Emp(int sal, String name){
		this.sal = sal;
		this.name = name;
		this.addr = "서울";
	}

}
class ConstructorOverloading02
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp("이순신", 300, "제주");
		Emp e3 = new Emp("김갑수");
		Emp e4 = new Emp("유관순", 800);
		Emp e5 = new Emp(900, "진진");


		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
	
	}
}
