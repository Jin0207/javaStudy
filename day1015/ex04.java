class Student
{
	private int number;
	public String name;

	//3. name ��������� public�̾ ������ ������ ���̵� ���ٰ���
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumbaer(){
		return number;
	}
}
public class  GraduateStudent extends Student
{
	public String lab;
	//4.
	GraduateStudent(){
		super();
	}
}
/*
1. ���� Ŭ���� : Student�̰� ���� Ŭ������ GraduateStudent �̴�.
2. 
Student
- number : int
+ name : String
------------------------
+ setNumber() : void
+ getNumber() : int
============================
GraduateStudent
+ name : String
+ lab : String
5. 1��
*/