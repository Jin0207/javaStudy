class Person
{
	protected String name;
	protected String addr;
	protected String phoneNumber;

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddr(String addr){
		this.addr = addr;
	}
	public String getAddr(){
		return addr;
	}
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
}
class Customer extends Person  
{
	private String pointNumber;
	private double point;

	public void setPointNumber(String pointNumber){
		this.pointNumber = pointNumber;
	}
	public String getPointNumber(){
		return pointNumber;
	}
	public void setPoint(double point){
		this.point = point;
	}
	public double gerPoint(){
		return point;
	}
	public void printCustomer(){
		System.out.printf("고객이름: %s%n", name);
		System.out.printf("고객주소: %s%n", addr);
		System.out.printf("고객번호: %s%n", phoneNumber);
		System.out.printf("고객마일리지번호: %s%n", pointNumber);
		System.out.printf("고객마일리지점수: %.1f%n", point);
	}
}
class InheritanceTestCustomerProtected
{
	public static void main(String[] args) 
	{
		Customer s = new Customer();

		s.setName("상진");
		s.setAddr("서울특별시 노원구 상계동");
		s.setPhoneNumber("010-1234-1234");
		s.setPointNumber("111-547-1234");
		s.setPoint(10.7);
		s.printCustomer();
	}
}
