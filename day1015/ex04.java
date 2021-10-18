class Student{
	private int number;
	public String name;
	//public은 바로접근할 수 있으니 setter getter를 안만들어도 된다.
	//만들어도 상관없음

	//3. name 멤버변수는 public이어서 설정자 제어자 없이도 접근가능
	public void setNumber(int number){
		this.number = number;
	}
	public int getNumbaer(){
		return number;
	}
}
public class  GraduateStudent extends Student{
	public String lab;
	//4.
	
	GraduateStudent(){
		super();
	}
}
/*
1. 수퍼 클래스 : Student이고 서브 클래스는 GraduateStudent 이다.
2. 
Student
- number : int
+ name : String
------------------------
			↑
GraduateStudent
+ lab : String
--------------------------

5. 1번
*/