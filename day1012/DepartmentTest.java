//�μ� Ŭ������ ����� �Ӽ����δ� �μ���ȣ,�μ���,�μ���ġ�� �����Ѵ�.
class Department
{
	private int number;
	private String name;
	private String location;

	public Department(){
		number = 7;
		name = "�ѹ���";
		location = "����";
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
		result += "�μ� ��ȣ: " + number + "\n";
		result += "�μ���: " + name + "\n";
		result += "�μ���ġ: " + location + "\n";
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
		dp.setName("�濵������");
		dp.setLocation("�λ�");
		System.out.print(dp);
	}
}
