class Dog
{
	private String dname;
	public String dbreed;
	private int dage;
	
	public String toString(){
		return "������ �̸�: " + dname + ", ���� : " + dbreed + ",  ����: " + dage;
	}
	/*public Dog(){
		//�⺻������ �ʱ�ȭ����
	}*/
	public void setDage(int dage){
		this.dage = dage;
	}
	public int getDage(){
		return dage;
	}
}
class DefaultConstructor01 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		System.out.println(d1);
		d1.dbreed = "�㽺Ű";
		d1.setDage(11);
		System.out.println(d1);
	}
}
