//public class Bike -- �ҽ����ϸ� Bike�� �Ǿ�� public�� ����� �� �ִ�.
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
		�����ڴ� main�޼���ȿ��� ������ �� ����
		gear�� private���� �ȿ� �����Ƿ� �θ�Ŭ������ �޼��带 ���� ���������� �����ؾ���
		�Ǵ� �θ�Ŭ�������� gear�� protected �����ڷ� �������־����
		�����ڴ� ��ü�� ������ �� ����Ǵ� ��ü�� �������־�� ������
		*/
	}
}
