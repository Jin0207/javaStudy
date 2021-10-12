class Dog
{
	private String dname;
	public String dbreed;
	private int dage;
	
	public String toString(){
		return "°­¾ÆÁö ÀÌ¸§: " + dname + ", Á¾·ù : " + dbreed + ",  ³ªÀÌ: " + dage;
	}
	public Dog(){
		
	}
	public Dog(String dname, int dage){
		this.dname = dname;
		this.dage = dage;
	}
	public Dog(String dname, String dbreed, int dage){
		this.dname = dname;
		this.dbreed = dbreed;
		this.dage = dage;
	}
	public void setDname(String dname){
		this.dname = dname;
	}
	public String getDname(){
		return dname;
	}
	public void setDage(int dage){
		this.dage = dage;
	}
	public int getDage(){
		return dage;
	}
}
class DogTest 
{
	public static void main(String[] args) 
	{
		Dog d1 = new Dog();
		Dog d2 = new Dog("ºÏÀÌ", "ºñ¼õ", 8);
		Dog d3 = new Dog("ºÏºÏ", 8);
		d3.dbreed = "Áøµ¾°³";

		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		d1.setDname("º¹ÀÌ");
		d1.dbreed = "Çã½ºÅ°";
		d1.setDage(11);
		System.out.println(d1);
	}
}
