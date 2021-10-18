class Employee{
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
	public void computeSalary(){
		//구체화 할 수없어서 비워둠, 자식클래스로가서 다르게 사용(월급 or 시급x시간)
		//return;
	}
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
class EmployeeTest{
	public static void main(String[] args){
		SalariedEmployee e1 = new SalariedEmployee("임상진", "A5678", 3);
		HourlyEmployee e2 = new HourlyEmployee("돌반장", "B789", 15000, 8);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println("=================================================");
		e1.computeSalary();
		e2.computeSalary();
		System.out.println(e1);
		System.out.println(e2);
	}
}
