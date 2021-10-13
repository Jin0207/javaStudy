class Plane
{
	private String make;
	private String model;
	private int maxP;
	public static int planes;
	//생성자
	Plane(){
		planes++;
	}

	Plane(String make, String model, int maxP){
		this.make = make;                                  
		this.model = model;
		this.maxP = maxP;
		planes++;
	}
	//메서드
	public static int getPlanes(){
		return planes;
	}
	public String toString(){
		return "[비행기의 제작사: " + make + ", 모델: " + model + ", 최대 승객수 : " + maxP + "명]";
	}
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setMaxP(int maxP){
		this.maxP = maxP;
	}
	public int getMaxP(){
		return maxP;
	}

}
class  PlaneTest
{
	
	public static void main(String[] args) 
	{
		Plane p1 = new Plane();
		Plane p2 = new Plane("에어버스","A380",500);
		Plane p3 = new Plane();

		p1.setMake("아시아나");
		p1.setModel("A830");
		p1.setMaxP(500);

		p3.setMake("대한");
		p3.setModel("K111");
		p3.setMaxP(900);

		System.out.println("총 비행기는 : " + Plane.getPlanes() + " 대");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println( "비행기 제작사:  " + p3.getMake() +"모델명: " +  p3.getModel() + "최대 수용인원: " + p3.getMaxP());
		
	}
}
