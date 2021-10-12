//부서 클래스를 만들어 속성으로는 부서번호,부서명,부서위치를 정의한다.
class Department
{
	private int number;
	private String name;
	private String location;

	public Department(int number, String name, String location){
		this.number = number;
		this.name = name;
		this.location = location;
	}
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumber(){
		return number;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public String getLocation(){
		return location;
	}
	public String toString(){
		String result = "";
		result += "부서 번호: " + number + "\n";
		result += "부서명: " + name + "\n";
		result += "부서위치: " + location + "\n";
		return result;
	}
}
class  DepartmentTest02
{
	public static void main(String[] args) 
	{
		Department dp1 = new Department(10, "총무팀", "서울");
		Department dp2 = new Department(20, "개발팀", "제주");
		
		System.out.println(dp1);
		System.out.println(dp2);
		
	}
}
