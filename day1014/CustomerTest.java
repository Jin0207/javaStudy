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

		System.out.printf("���̸�: %s%n", s.name);
		System.out.printf("���ּ�: %s%n", s.addr);
		System.out.printf("����ȣ: %s%n", s.phoneNumber);
		System.out.printf("�����ϸ�����ȣ: %s%n", s.pointNumber);
		System.out.printf("�����ϸ�������: %.1f%n", s.point);
	}
}
