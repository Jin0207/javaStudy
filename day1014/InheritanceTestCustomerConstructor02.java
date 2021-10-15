class Person
{
	protected String name;
	protected String addr;
	protected String phone;

	public Person(String name, String addr, String phone){
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}
	public Person(){		
	}
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
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}

}
class Customer extends Person
{
	private String number;
	private double mileage;

	public Customer(String name, String addr, String phone, String number, double milege){
		/*
		this.name = name;
		this.addr = addr;
		this.phone = phone;
		*/
		super(name, addr, phone);
		this.number = number;
		this.mileage = milege;
	}
	public Customer(){
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return number;
	}
	public void setMilege(double mileage){
		this.mileage = mileage;
	}
	public double getMileage(){
		return mileage;
	}

	public void printCustomer(){
		System.out.printf("이름: %s%n", name);
		System.out.printf("주소: %s%n", addr);
		System.out.printf("전화번호: %s%n", phone);
		System.out.printf("고객번호: %s%n", number);
		System.out.printf("마일리지: %.2f%n", mileage);
	}
}
class  InheritanceTestCustomerConstructor02
{
	public static void main(String[] args) 
	{
		Customer c = new Customer("임상진","서울특별시 노원구 상계동", "01012341234", "123-456-789", 120.8);
		c.printCustomer();
	}
}
