class Employee
{
	private int eno;
	private String ename;
	private int esal;
	private String ehiredate;
	private String dname;

	public Employee(int eno, String ename, int esal, String ehiredate, String dname){
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.ehiredate = ehiredate;
		this.dname = dname;
	}

	public void setEno(int eno){
		this.eno = eno;
	}
	public int getEno(){
		return eno;
	}
	public void setEname(String name){
		this.ename = ename;
	}
	public String getEname(){
		return ename;
	}
	public void setEsal(int sal){
		this.esal = sal;
	}
	public int getEsal(){
		return esal;
	}
	public void setEhiredate(String ehiredate){
		this.ehiredate = ehiredate;
	}
	public String getEhiredate(){
		return ehiredate;
	}
	public void setDname(String dname){
		this.dname = dname;
	}
	public String getDepart(){
		return dname;
	}
	public String toString(){
		String result = "";
		result += "사원번호: " + eno + "\n";
		result += "사원명: " + ename + "\n";
		result += "급여: " + esal + " 만원\n";
		result += "입사일: " + ehiredate + "\n";
		result += "부서명: " + dname + "\n";
		return result;
	}
}
class  EmployeeTest
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(20, "김갑수", 180, "2021/10/12", "개발부");
		Employee e2 = new Employee(21, "이을용", 200, "2021/10/12", "영업부");

		System.out.println(e1);
		System.out.println(e2);
	}
}
