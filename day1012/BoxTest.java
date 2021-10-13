class Box
{
	private double height;
	private double width;
	private double length;
	private boolean empty;
	private String things; //���� ����
	
	public String toString(){
		String r = "�������";
		if(!empty){
			r = "�����������";
		}
		return "������ ����: " + height + ", ����: " + width + ", ����:" + length + ", ���빰: " + r + ", ��买��: " + things;
	}
	public Box(){	
		width = 100;
		height = 100;
		length = 100;
		empty = true;
	}

	public Box(double height, double width){
		this.height = height;
		this.width = width;
	}
	public void put(String things){
		this.things = things;
		empty = false;
		System.out.println("�ڽ��� " + things + " �� ��Ҿ��");
	}
	public String take(){
		String r = things;
		things = "����"; //���ھ��� ������ �������ϱ�
		empty = true;
		return r;
	}
}
class BoxTest 
{
	public static void main(String[] args) 
	{
		Box b1 = new Box(10,20);
		Box b2 = new Box();

		System.out.println(b1);
		System.out.println(b2);

		b1.put("��");
		b2.put("å");

		System.out.println(b1);
		System.out.println(b2);

		String r = b2.take();
		System.out.println("�ڽ�2���� ���� ����: " + r);
		System.out.println("=======================================");
		System.out.println(b1);
		System.out.println(b2);
	}
}
