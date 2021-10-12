class Box
{	
	//필드 정의
	int width;
	int length;
	int height;
	
	//메소드 정의
	public int getHeight(){
		return height;
	}
	public void setHeight(int h){
		height = h;
	}

	public int getLength(){
		return length;
	}
	public void setLength(int l){
		length = l;
	}

	public void setWidth(int w){
		width = w;
	}
	public int getWidth(){
		return width;
	}

	public int getVolume(){
		int volume = width*height*length;
		return volume;
	}
	
	public String toString(){
		String result = "가로:" + width + ", 세로: " + length + ", 높이: " + height;
		return result;
		//return Integer.toString(getVolume());
	}
}
public class  BoxTest
{
	public static void main(String[] args) 
	{
		//상자 객체를 가리킬 수 있는 참조변수 box1을 정의하라.
		Box box1;
		//상자 객체를 생성하여 참조변수 box1이 카리키게해라
		box1 = new Box();

		box1.setWidth(100);
		box1.setLength(100);
		box1.setHeight(100);
		System.out.println( box1.getVolume());
		System.out.println(box1);

		Box box2 = new Box();
		box2.setWidth(200);
		box2.setLength(200);
		box2.setHeight(200);
		System.out.println( box2.getVolume());
		System.out.println(box2);

		//참조변수 box2의 값을 box1에 대입한 후에 접근자를 통하여 box1의 속성값을 출력하여보자
		box1 = box2;
		//box1이 가리키고있는 객체가 box2가 가리키고 있는 객체로 바뀌었다.
		//box1이 맨처음에 참조하고 있던 가,세,높 100 객체는 이제 아무도 사용x
		//이젠 그 객체를 누구도 사용할 수 없음
		//더이상 사용할 수 없는 객체(메모리)를 garbage라고 합니다.
		
		System.out.println( box1.getVolume());
		System.out.println(box1);
		
	}
}
