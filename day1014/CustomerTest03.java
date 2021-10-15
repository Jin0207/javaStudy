class Person
{
	private String name;
	private String addr;
	private String phoneNumber;

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
	public void printCustomer(Customer s){
		System.out.printf("���̸�: %s%n", s.getName());
		System.out.printf("���ּ�: %s%n", s.getAddr());
		System.out.printf("����ȣ: %s%n", s.getPhoneNumber());
		System.out.printf("�����ϸ�����ȣ: %s%n", pointNumber);
		System.out.printf("�����ϸ�������: %.1f%n", point);
	}
}
class CustomerTest03
{
	public static void main(String[] args) 
	{
		Customer s = new Customer();

		s.setName("����");
		s.setAddr("����Ư���� ����� ��赿");
		s.setPhoneNumber("010-1234-1234");
		s.setPointNumber("111-547-1234");
		s.setPoint(10.7);
		s.printCustomer(s);
	}
}
