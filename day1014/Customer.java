class Person
{
	String name;
	String addr;
	String phoneNumber;
}
class Customer extends Person  
{
	String pointNumber;
		double point;
}
class CustomerTest
{
	public static void main(String[] args) 
	{
		Customer s = new Customer();

		s.name = "����";
		s.addr = "����Ư���� ����� ��赿";
		s.phoneNumber = "010-1234-1234";
		s.pointNumber = "111-547-1234";
		s.point = 10000;

		System.out.println(s.name);
		System.out.println(s.addr);
		System.out.println(s.phoneNumber);
		System.out.println(s.pointNumber);
		System.out.println(s.point);

	}
}
