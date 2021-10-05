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
		//super(); //Point의 부모인 Object(태초의부모)의 생성자 호출 
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point
{
	int z;

	Point3D(int x, int y, int z){
		super(x,y); //Point(int x, int y)를 호출
		this.z = z;
	}
}