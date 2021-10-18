import java.util.Scanner;

//�߻�޼��带 ������ �ֱ⶧���� �߻�Ŭ����������
abstract class Employee{
	protected String name;
	protected String no;
	protected int salary; //���ް���ϴ� �޼��带 ���� ����

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
	//�߻�޼��� : body�� ��üȭ�� �� ���� �޼���

	public String toString(){
		return "�̸�: " + name + ", �����ȣ: " + no + ", �޿�: " + salary;
	}
}

class SalariedEmployee extends Employee{
	//�����̶�� �ʵ� �߰� , ������ �⺻��, ����, ȣ������ ��������
	private int grade; //ȣ��
	private int base; //�⺻�� -ȣ�������� ������
	private int allowance;//���� -ȣ�������� ������
	//ȣ�������� �⺻�ް� ������ �������ϱ� �������� �Ű������� �Է���������
	public SalariedEmployee(String name, String no, int grade){
		super(name, no);
		this.grade = grade;
	}
	public SalariedEmployee(){
	}
	//ȣ�������� �⺻�ް� ������ �������� ������ setter�� �ȸ���� getter�� ����
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
		//ȣ���� ���� �⺻�ް� ������ ����
		//�޿� = �⺻�� + ����
		//ȣ�� : 1~3ȣ������ ����
		switch(grade){
			case 1: base = 200; allowance = 50; break;
			case 2: base = 250; allowance = 80; break;
			case 3: base = 300; allowance = 100; break;
		}
		salary = base + allowance;
	}
	*/
	public String toString(){
		return super.toString() + ", ȣ��: " + grade + ", �⺻��: "  + base + ", ����" + allowance;
	}
}

class HourlyEmployee extends Employee{
	private int base; //�ð��� �ӱ�
	private int time; //���� �ð�

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
		return super.toString() + ", �ñ�: " + base + ", ���ѽð�: " + time;
	}
}

class EmployeeTestAbstractNoOverriding{
	public static void main(String[] args){
		//�θ�Ŭ������ �ڽ�Ŭ������ ��ü�� ������ �� �ִ�.
		//��������� �������������, �ð���������� ��� �� ������ �Է¹޾� ó��
		//������ �췯���� ����� ������ �� �ְ�, �ð��� ����� ������ �� �ִ� Ŭ������
		//�θ��� EmployeeŬ�����̹Ƿ� �θ�Ŭ������ ���������� �����ȴ�.
		Employee e1;
		Scanner sc = new Scanner(System.in);
		int type;
		//������: 1. �ð���: 2
		String name, no; //�θ�Ŭ������ ����
		do{
			System.out.print("����� ������ �Է��ϼ���. 1:������, 2:�ð��� ->");
			type = sc.nextInt();
		}while( type != 1 && type != 2);

		System.out.print("�̸��� �Է��ϼ��� ->");
		name = sc.next();
		System.out.print("�����ȣ�� �Է��ϼ��� ->");
		no = sc.next();
		
		if(type == 1){
			int grade;
			System.out.print("����� ȣ���� �Է��ϼ��� ->");
			grade = sc.nextInt();
			e1 = new SalariedEmployee(name, no, grade);
		}else{
			int base, time;
			System.out.print("����� �ñ��� �Է��ϼ��� ->");
			base = sc.nextInt();
			System.out.print("����� �ٹ��ð��� �Է��ϼ��� ->");
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

�߻�޼��带 ���� �߻�Ŭ������ �θ�� �����ִ�
�ڽ�Ŭ�������� �߻�޼��带 �����������ʾ� �����߻�

��ӹ��� �߻�޼���� �ݵ�� �ϼ�(����)�����ش�.
*/