class Student{
	protected String name;
	protected String no;
	protected String major;
	protected int grade;
	protected double credit;
	//������
	Student(){
	}

	Student(String name, String no, String major, int grade, int credit){
		this.name = name;
		this.no = no;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	//�޼���
	public String toString(){
		return "�̸�: " + name + ", �й�: " + no + ", �Ҽ��а�: " + major + ",  " + grade + "�г�" + ", �̼�����: " + credit;
	}
	//setter, getter
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
	public void setCredit(double credit){
		this.credit = credit;
	}
	public double getCredit(){
		return credit;
	}
}
class UnderGraduate extends Student
{
	public String club;

	public String toString(){
		return super.toString() + "�Ҽ� ���Ƹ�: " + club;
	}
	//������
	UnderGraduate(){
		super();
	}
	UnderGraduate(String name, String no, String major, int grade, int credit, String club){
		super(name, no, major, grade, credit);
		this.club = club;
	}
}
class Graduate extends Student
{
	public String type;
	private double scholarship;
	//������
	Graduate(){
		super();
	}
	Graduate(String name, String no, String major, int grade, int credit, String type, double scholarship){
		super(name, no, major, grade, credit);
		this.type = type;
		this.scholarship = scholarship;
	}
	public String toString(){
		return super.toString() + "���� ����: " + type + "���б� ����: " + scholarship;
	}
	//getter setter
	public void setScholarship(double scholarship){
		this.scholarship = scholarship;
	}
	public double getScholarship(){
		return scholarship;
	}
}
class  Programming07
{
	public static void main(String[] args) 
	{
		Student s = new Student("�ӻ���", "201310025", "����濵����", "3", 120);
		UnderGraduate ug = new UnderGraduate("�ӻ���", "201310025", "����濵����", "3", 120, "cbc");
		Graduate gd = new Graduate("�ӻ���",  "201310025", "����濵����", "3", 120, "��������", 0.85);

		System.out.println(s);
		System.out.println(ug);
		System.out.println(gd);
	}
}
