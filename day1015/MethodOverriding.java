class Vehicle
{
	public void run(){
		System.out.println("탈것이 달린다.");
	}
}
class Bike extends Vehicle
{
	public void run(){
		System.out.println("자전거를 타고 달린다.");
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
