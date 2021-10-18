//public class Bike -- 소스파일명도 Bike가 되어야 public을 사용할 수 있다.
class Bike
{
	private int gear;
	public int speed;

	public void setGear(int gear){
		this.gear = gear;
	}
	public int getGear(){
		return gear;
	}
}
public class  MountainBike extends Bike
{   
	public MountainBike(int g){
			super();
			setGear(g);
		}
	public static void main(String[] args) 
	{
		int seatHeight;
		MountainBike a = new MountainBike(10);
		System.out.println(a.getGear());
		/*MountainBike(int g){
			super();
			gear = g;
		}
		생성자는 main메서드안에서 정의할 수 없음
		gear는 private영역 안에 있으므로 부모클래스의 메서드를 통해 간접적으로 접근해야함
		또는 부모클래스에서 gear를 protected 제어자로 정의해주어야함
		생성자는 객체가 생성될 때 실행되니 객체를 생성해주어야 실행함
		*/
	}
}
