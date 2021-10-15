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

		s.name = "상진";
		s.addr = "서울특별시 노원구 상계동";
		s.phoneNumber = "010-1234-1234";
		s.pointNumber = "111-547-1234";
		s.point = 10000;

		System.out.printf("고객이름: %s%n", s.name);
		System.out.printf("고객주소: %s%n", s.addr);
		System.out.printf("고객번호: %s%n", s.phoneNumber);
		System.out.printf("고객마일리지번호: %s%n", s.pointNumber);
		System.out.printf("고객마일리지점수: %.1f%n", s.point);
	}
}
