//사각형을 나타내는 Reactangle 클래스를 만들어봅니다.
//Reactangle클래스는 가로길이와 세로길이를 속성으로 가지고 있다.
//또, 사각형의 넓이를 계산하여 반환하는 메서드를 갖도록 합니다.
//Reactangle 클래스와 Reactangle을 이용하는 RectangleTest를 만들어봅니다.
class Rectangle
{
	double width, height;
	/*
	double getArea(){
		double result = width * height;
		return result;
	}
	*/
	void getArea(){
		System.out.printf("사각형의 면적은 %.1f입니다.\n", width * height);
	}
}
class   RectangleTest
{
	public static void main(String[] args) 
	{
		Rectangle rt = new Rectangle();
		rt.width = 20.5;
		rt.height = 21.2;
		/*
		int result = 0;
		result = rt.area(rt.width,rt.height);
		
		System.out.println(result);
		*/
		rt.getArea();
	}
}
