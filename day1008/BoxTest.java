class Box
{	
	//�ʵ� ����
	int width;
	int length;
	int height;
	
	//�޼ҵ� ����
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
		String result = "����:" + width + ", ����: " + length + ", ����: " + height;
		return result;
		//return Integer.toString(getVolume());
	}
}
public class  BoxTest
{
	public static void main(String[] args) 
	{
		//���� ��ü�� ����ų �� �ִ� �������� box1�� �����϶�.
		Box box1;
		//���� ��ü�� �����Ͽ� �������� box1�� ī��Ű���ض�
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

		//�������� box2�� ���� box1�� ������ �Ŀ� �����ڸ� ���Ͽ� box1�� �Ӽ����� ����Ͽ�����
		box1 = box2;
		//box1�� ����Ű���ִ� ��ü�� box2�� ����Ű�� �ִ� ��ü�� �ٲ����.
		//box1�� ��ó���� �����ϰ� �ִ� ��,��,�� 100 ��ü�� ���� �ƹ��� ���x
		//���� �� ��ü�� ������ ����� �� ����
		//���̻� ����� �� ���� ��ü(�޸�)�� garbage��� �մϴ�.
		
		System.out.println( box1.getVolume());
		System.out.println(box1);
		
	}
}
