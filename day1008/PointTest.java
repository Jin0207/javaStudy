class Point
{
	private int x;
	private int y;
	
	public int getX(){
		return x;
	}

	public int getY(){ //get���� �����ϴ� �޼��尡 ������
		return y;
	}

	public void setX(int xCoord){ //set���� �����ϴ� �޼��尡 ������
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
		
		System.out.printf("ù��° ��ü�� x:%d, y:%d", p1.getX(), p1.getY());
		System.out.printf("�ι�° ��ü�� x:%d, y:%d", p2.getX(), p2.getY());
	}
}
