class Vehicle
{
	public void run(){
		System.out.println("Ż���� �޸���.");
	}
}
class Bike extends Vehicle
{
	public void run(){
		System.out.println("�����Ÿ� Ÿ�� �޸���.");
	}
}
class MethodOverriding
{
	public static void main(String[] args) 
	{
		Vehicle v = new Vehicle();
		Bike b = new Bike();

		v.run();
		b.run();
	}
}
