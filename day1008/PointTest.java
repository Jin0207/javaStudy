class Point
{
	private int x;
	private int y;
	
	public int getX(){
		return x;
	}

	public int getY(){ //get으로 시작하는 메서드가 접근자
		return y;
	}

	public void setX(int xCoord){ //set으로 시작하는 메서드가 설정자
		x = xCoord;
	}

	public void setY(int yCoord){
		y = yCoord;
	}
}

class PointTest 
{
	public static void main(String[] args) 
	{
		Point p1 = new Point();
		p1.setX(100);
		p1.setY(200);
		Point p2 = new Point();
		p2.setX(100);
		p2.setY(300);
		
		System.out.printf("첫번째 객체의 x:%d, y:%d", p1.getX(), p1.getY());
		System.out.printf("두번째 객체의 x:%d, y:%d", p2.getX(), p2.getY());
	}
}
