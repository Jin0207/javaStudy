class Box
{
	private int height;
	private int width;
	private String empty;
	
	public String toString(){
		return "������ ����: " + height + ", �ʺ�: " + width + ", ���빰: " + empty;
	}
	public Box(){
		
	}
	public Box(int height, int width){
		this.height = height;
		this.width = width;
	}
	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return height;
	}
	public void setWidth(int width){
		this.width = width;
	}
	public int getWidth(){
		return width;
	}
}
class BoxTest 
{
	public static void main(String[] args) 
	{
		Box b = new Box();
		b.setHeight(200);
		b.setWidth(200);
		System.out.println(b);
	}
}
