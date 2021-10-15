class A
{
	public A(){
		System.out.println("A의 기본생성자 동작");
	}
}
class B extends A
{
	public B(){
		System.out.println("B의 기본생성자 동작");
	}
}
class InheritanceTestConstructor 
{
	public static void main(String[] args) 
	{
		B b = new B();
	}
}
