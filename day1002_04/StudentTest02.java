class StudentTest02  
{
	public static void main(String[] args) 
	{
		Student sd = new Student();
		sd.name = "ȫ�浿";
		sd.ban = 1;
		sd.num = 1;
		sd.kor = 100;
		sd.eng = 60;
		sd.math = 76;

		System.out.println("�̸�: " + sd.name);
		System.out.println("����: " + sd.getTotal());
		System.out.println("���: " + sd.getAverage());
	}
}
class Student
{
	String name;
	int num, ban, kor, eng, math;
	
	Student(){};

	Student(String name, int ban, int num, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getTotal(){
		return kor+eng+math;
	}
	public float getAverage(){
		return (int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f;
	}
}