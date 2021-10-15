class Employee
{
	private String name;
	private String no;
	//생성자
	Employee(){
	}
	Employee(String name, String no){
		this.name = name;
		this.no = no;
	}
	//setter getter
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
	//월급계산하는 메서드
	public String computeSalary(){
		return "만원";
	}
	//화면출력을위한 메서드
	public String toString(){
		return "이름: " + name + ", 사원번호: " + no + "월급: " + computeSalary();
	}
}
class SalariedEmployee extends Employee
{
	private int salary;
	//생성자
	SalariedEmployee(){
	}
	SalariedEmployee(String name, String no, int salary){
		super(name, no);
		this.salary = salary;
	}
	//setter getter
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}

	public String computeSalary(){
		return salary + super.computeSalary();
	}

	public String toString(){
		return super.toString() ;
	}
}
class HourlyEmployee extends Employee
{
	private int wage_h;
	private double work_h;
	private double salary_d;
	//생성자
	public HourlyEmployee(){
	}
	public HourlyEmployee(String name, String no, int wage_h, double work_h){
		super(name, no);
		this.wage_h = wage_h;
		this.work_h = work_h;
	}
	//setter getter
	public void setWage_h(int wage_h){
		this.wage_h = wage_h;
	}
	public int getWage_h(){
		return wage_h;
	}
	public void setWork_h(double work_h){
		this.work_h = work_h;
	}
	public double getWork_h(){
		return work_h;
	}
	//화면출력을위한 메서드
	public String computeSalary(){
		salary_d = wage_h * work_h;
		return salary_d;
	}
	public String toString(){
		return super.toString() + ", 일급: " + salary_d + "원" ;
	}
}
class Worker
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("상진", "11");
		SalariedEmployee se = new SalariedEmployee("임상", "22", 800);
		HourlyEmployee he = new HourlyEmployee("임상진", "27", 8, 10000);

		System.out.println(e);
		System.out.println(se);
		System.out.println(he);
	}
}
