class A
{
	public A(int i){
		System.out.println("A의 매개변수를 갖는 생성자 동작");
	}
}
class B extends A
{
	public B(){
		super(5);
		System.out.println("B의 기본생성자 동작");
	}
}
class InheritanceTestConstructor03
{
	public static void main(String[] args) 
	{
		B b = new B();
	}
}
