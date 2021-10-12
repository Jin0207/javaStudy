//부서 클래스를 만들어 속성으로는 부서번호,부서명,부서위치를 정의한다.
class Department
{
	private int number;
	private String name;
	private String location;

	public Department(){
		number = 7;
		name = "총무부";
		location = "서울";
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
class  DepartmentTest
{
	public static void main(String[] args) 
	{
		Department dp = new Department();
		System.out.print(dp);

		dp.setNumber(19);
		dp.setName("경영지원팀");
		dp.setLocation("부산");
		System.out.print(dp);
	}
}
