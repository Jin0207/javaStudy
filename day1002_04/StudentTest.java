class StudentTest  
{
	public static void main(String[] args) 
	{
		Student sd = new Student("ȫ�浿", 1, 1, 100, 60, 76);
		String str = sd.info();
		
		System.out.println(str);
	}
}
class Student
{
	String name;
	int num, ban, kor, eng, math;
	
	Student(String name, int ban, int num, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String info(){
		return name 
			+ "," + ban 
			+ "," + num 
			+ "," + kor 
			+ "," + eng 
			+ "," + math
			+ "," + (kor+eng+math)
			+ "," + (int)((kor+eng+math) / 3.0 * 10 + 0.5) / 10.0;
	}
}