import java.util.Scanner;

//추상메서드를 가지고 있기때문에 추상클래스여야함
abstract class Employee{
	protected String name;
	protected String no;
	protected int salary; //월급계산하는 메서드를 위한 변수

	public Employee(String name, String no){
		this.name = name;
		this.no = no;
	}
	public Employee(){
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setNo(String no){
		this.no = no;
	}
	public String getNo(){
		return no;
	}
	public int getSalary(){
		return salary;
	}
	abstract void computeSalary();
	//추상메서드 : body를 구체화할 수 없는 메서드

	public String toString(){
		return "이름: " + name + ", 사원번호: " + no + ", 급여: " + salary;
	}
}

class SalariedEmployee extends Employee{
	//월급이라는 필드 추가 , 월급은 기본급, 수당, 호봉으로 정해진다
	private int grade; //호봉
	private int base; //기본급 -호봉에따라서 정해짐
	private int allowance;//수당 -호봉에따라서 정해짐
	//호봉에따라서 기본급과 수당이 정해지니깐 생성자의 매개변수에 입력하지않음
	public SalariedEmployee(String name, String no, int grade){
		super(name, no);
		this.grade = grade;
	}
	public SalariedEmployee(){
	}
	//호봉에따라 기본급과 수당은 정해지기 때문에 setter는 안만들고 getter만 만듦
	public void setGrade(int grade){
		this.grade = grade;
	}
	public int getGrade(){
		return grade;
	}
	public int getBase(){
		return base;
	}
	public int getAllowance(){
		return allowance;
	}
	/*
	public void computeSalary(){
		//호봉에 따라 기본급과 수당을 결정
		//급여 = 기본금 + 수당
		//호봉 : 1~3호봉까지 존재
		switch(grade){
			case 1: base = 200; allowance = 50; break;
			case 2: base = 250; allowance = 80; break;
			case 3: base = 300; allowance = 100; break;
		}
		salary = base + allowance;
	}
	*/
	public String toString(){
		return super.toString() + ", 호봉: " + grade + ", 기본급: "  + base + ", 수당" + allowance;
	}
}

class HourlyEmployee extends Employee{
	private int base; //시간당 임금
	private int time; //일한 시간

	public HourlyEmployee(String name, String no, int base, int time){
		super(name, no);
		this.base = base;
		this.time = time;
	}
	public HourlyEmployee(){
	}
	public void setBase(int base){
		this.base = base;
	}
	public int getBase(){
		return base;
	}
	public void setTime(int time){
		this.time = time;
	}
	public int getTime(){
		return time;
	}
	public void computeSalary(){
		salary = base * time;
	}
	public String toString(){
		return super.toString() + ", 시급: " + base + ", 일한시간: " + time;
	}
}

class EmployeeTestAbstractNoOverriding{
	public static void main(String[] args){
		//부모클래스가 자식클래스의 객체를 참조할 수 있다.
		//사용자한테 월급제사원인지, 시간제사원인지 물어본 후 데이터 입력받아 처리
		//변수를 우러급제 사원도 참조할 수 있고, 시간제 사원도 참조할 수 있는 클래스는
		//부모인 Employee클래스이므로 부모클래스로 참조변수를 만들면된다.
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type;
		//월급제: 1. 시간제: 2
		String name, no; //부모클래스의 변수
		do{
			System.out.print("사원의 종류를 입력하세요. 1:월급제, 2:시간제 ->");
			type = sc.nextInt();
		}while( type != 1 && type != 2);

		System.out.print("이름을 입력하세요 ->");
		name = sc.next();
		System.out.print("사원번호를 입력하세요 ->");
		no = sc.next();
		
		if(type == 1){
			int grade;
			System.out.print("사원의 호봉을 입력하세요 ->");
			grade = sc.nextInt();
			e1 = new SalariedEmployee(name, no, grade);
		}else{
			int base, time;
			System.out.print("사원의 시급을 입력하세요 ->");
			base = sc.nextInt();
			System.out.print("사원의 근무시간을 입력하세요 ->");
			time = sc.nextInt();
			e1 = new HourlyEmployee(name, no, base, time);
		}//end if

		e1.computeSalary();
		System.out.println(e1);
	}
}

/*
EmployeeTestAbstractNoOverriding.java:38: error: SalariedEmployee is not abstract and does not override abstract method computeSalary() in Employee
class SalariedEmployee extends Employee{
^
1 error

추상메서드를 가진 추상클래스를 부모로 갖고있는
자식클래스에서 추상메서드를 구현해주지않아 에러발생

상속받은 추상메서드는 반드시 완성(구현)시켜준다.
*/