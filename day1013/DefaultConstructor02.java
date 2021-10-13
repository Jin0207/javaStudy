class Dog
{
	private String dname;
	public String dbreed;
	private int dage;
	
	public String toString(){
		return "강아지 이름: " + dname + ", 종류 : " + dbreed + ",  나이: " + dage;
	}
	/*public Dog(){
		//기본값으로 초기화해줌
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
		d1.dbreed = "허스키";
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

사용자가 생성자를 정의했기때문에 
자바는 기본생성자를 제공하지 않는다.

기본값을 가진 멤버변수가 필요하다면
기본생성자를 따로 만들어주어야한다.
혹시,모르니
생성자를 정의해준다면
기본생성자를 같이 정의해준다.
*/