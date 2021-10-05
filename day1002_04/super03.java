class super03 
{
	public static void main(String[] args) 
	{
		Point3D d = new Point3D(1, 2, 3);
		System.out.println("x: " + d.x + " ,y: " + d.y + " ,z: " + d.z);
	}
}

class Point
{
	int x, y;

	Point(int x, int y){
		//super(); //Point�� �θ��� Object(�����Ǻθ�)�� ������ ȣ�� 
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point
{
	int z;

	Point3D(int x, int y, int z){
		super(x,y); //Point(int x, int y)�� ȣ��
		this.z = z;
	}
}