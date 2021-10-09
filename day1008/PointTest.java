class Point
{
	int x;
	int y;
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int xCoord){
		System.out.printf("xÀÇ ÁÂÇ¥: %d%n", getX());
	}
	public void setY(int yCoord){
		System.out.printf("yÀÇ ÁÂÇ¥: %d%n", getY());
		
	}
}
public class PointTest 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		p1.x = 100;
		p1.setX(p1.getX());
		p1.y = 200;
		p1.setY(p1.getY());

		System.out.println();
		Point p2 = new Point();
		p2.x = 100;
		p2.setX(p2.getX());
		p2.y = 300;
		p2.setY(p2.getY());
	}
}
