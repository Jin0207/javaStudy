class Plane
{
	private String make;
	private String model;
	private int maxP;
	public static int planes;
	//������
	Plane(){
		planes++;
	}

	Plane(String make, String model, int maxP){
		this.make = make;                                  
		this.model = model;
		this.maxP = maxP;
		planes++;
	}
	//�޼���
	public static int getPlanes(){
		return planes;
	}
	public String toString(){
		return "[������� ���ۻ�: " + make + ", ��: " + model + ", �ִ� �°��� : " + maxP + "��]";
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
		Plane p2 = new Plane("�������","A380",500);
		Plane p3 = new Plane();

		p1.setMake("�ƽþƳ�");
		p1.setModel("A830");
		p1.setMaxP(500);

		p3.setMake("����");
		p3.setModel("K111");
		p3.setMaxP(900);

		System.out.println("�� ������ : " + Plane.getPlanes() + " ��");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println( "����� ���ۻ�:  " + p3.getMake() +"�𵨸�: " +  p3.getModel() + "�ִ� �����ο�: " + p3.getMaxP());
		
	}
}
