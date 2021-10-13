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
		d1.dbreed = "허스키";
		d1.setDage(11);
		System.out.println(d1);
	}
}
