//�簢���� ��Ÿ���� Reactangle Ŭ������ �����ϴ�.
//ReactangleŬ������ ���α��̿� ���α��̸� �Ӽ����� ������ �ִ�.
//��, �簢���� ���̸� ����Ͽ� ��ȯ�ϴ� �޼��带 ������ �մϴ�.
//Reactangle Ŭ������ Reactangle�� �̿��ϴ� RectangleTest�� �����ϴ�.
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
		System.out.printf("�簢���� ������ %.1f�Դϴ�.\n", width * height);
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
