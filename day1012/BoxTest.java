class Box
{
	private double height;
	private double width;
	private double length;
	private boolean empty;
	private String things; //담을 물건
	
	public String toString(){
		String r = "비어있음";
		if(!empty){
			r = "비어있지않음";
		}
		return "상자의 높이: " + height + ", 가로: " + width + ", 세로:" + length + ", 내용물: " + r + ", 담긴물건: " + things;
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
		System.out.println("박스에 " + things + " 를 담았어요");
	}
	public String take(){
		String r = things;
		things = "없음"; //상자안의 물건을 꺼냈으니깐
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

		b1.put("공");
		b2.put("책");

		System.out.println(b1);
		System.out.println(b2);

		String r = b2.take();
		System.out.println("박스2에서 꺼낸 물건: " + r);
		System.out.println("=======================================");
		System.out.println(b1);
		System.out.println(b2);
	}
}
