class A
{
	public A(int i){
		System.out.println("A�� �Ű������� ���� ������ ����");
	}
}
class B extends A
{
	public B(){
		super(5);
		System.out.println("B�� �⺻������ ����");
	}
}
class InheritanceTestConstructor03
{
	public static void main(String[] args) 
	{
		B b = new B();
	}
}
