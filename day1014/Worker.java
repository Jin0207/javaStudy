class Employee
{
	private String name;
	private String no;
	//������
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
	//���ް���ϴ� �޼���
	public String computeSalary(){
		return "����";
	}
	//ȭ����������� �޼���
	public String toString(){
		return "�̸�: " + name + ", �����ȣ: " + no + "����: " + computeSalary();
	}
}
class SalariedEmployee extends Employee
{
	private int salary;
	//������
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
	//������
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
	//ȭ����������� �޼���
	public String computeSalary(){
		salary_d = wage_h * work_h;
		return salary_d;
	}
	public String toString(){
		return super.toString() + ", �ϱ�: " + salary_d + "��" ;
	}
}
class Worker
{
	public static void main(String[] args) 
	{
		Employee e = new Employee("����", "11");
		SalariedEmployee se = new SalariedEmployee("�ӻ�", "22", 800);
		HourlyEmployee he = new HourlyEmployee("�ӻ���", "27", 8, 10000);

		System.out.println(e);
		System.out.println(se);
		System.out.println(he);
	}
}
