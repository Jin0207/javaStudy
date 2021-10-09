class Box
{	
	//필드 정의
	int width;
	int length;
	int height;
	
	//메소드 정의
	public int getVolume(){
		return width*height*length;
	}
	
	public String toString(int value){
		return Integer.toString(getVolume());
	}


}
public class  BoxTest
{
	public static void main(String[] args) 
	{
		Box box1 = new Box();
		box1.width = 100;
		box1.length = 100;
		box1.height = 100;
		
		System.out.println(box1.getVolume());
		System.out.println(box1);

		Box box2 = new Box();
		box2.width = 200;
		box2.length = 200;
		box2.height = 200;

		System.out.println(box2.getVolume());
		System.out.println(box2);

		box1 = box2;
		System.out.println(box1.getVolume());
	}
}
