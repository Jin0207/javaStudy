class Student{
	protected String name;
	protected String no;
	protected String major;
	protected int grade;
	protected double credit;
	//생성자
	Student(){
	}

	Student(String name, String no, String major, int grade, int credit){
		this.name = name;
		this.no = no;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	//메서드
	public String toString(){
		return "이름: " + name + ", 학번: " + no + ", 소속학과: " + major + ",  " + grade + "학년" + ", 이수학점: " + credit;
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
		return super.toString() + "소속 동아리: " + club;
	}
	//생성자
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
	//생성자
	Graduate(){
		super();
	}
	Graduate(String name, String no, String major, int grade, int credit, String type, double scholarship){
		super(name, no, major, grade, credit);
		this.type = type;
		this.scholarship = scholarship;
	}
	public String toString(){
		return super.toString() + "조교 유형: " + type + "장학금 비율: " + scholarship;
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
		Student s = new Student("임상진", "201310025", "산업경영공학", "3", 120);
		UnderGraduate ug = new UnderGraduate("임상진", "201310025", "산업경영공학", "3", 120, "cbc");
		Graduate gd = new Graduate("임상진",  "201310025", "산업경영공학", "3", 120, "교육조교", 0.85);

		System.out.println(s);
		System.out.println(ug);
		System.out.println(gd);
	}
}
