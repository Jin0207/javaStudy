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
	public Dog(String dname, int dage, String dbreed){
		this.dname = dname;
		this.dage = dage;
		this.dbreed = dbreed;
	}
	public void setDage(int dage){
		this.dage = dage;
	}
	public int getDage(){
		return dage;
	}
}
class DefaultConstructor02
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
/*
DefaultConstructor02.java:29: error: constructor Dog in class Dog cannot be applied to given types;
                Dog d1 = new Dog();
                         ^
  required: String,int,String
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error

����ڰ� �����ڸ� �����߱⶧���� 
�ڹٴ� �⺻�����ڸ� �������� �ʴ´�.

�⺻���� ���� ��������� �ʿ��ϴٸ�
�⺻�����ڸ� ���� ������־���Ѵ�.
Ȥ��,�𸣴�
�����ڸ� �������شٸ�
�⺻�����ڸ� ���� �������ش�.
*/