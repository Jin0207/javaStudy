class Movie
{
	private String title;
	private String director;
	private String make;

	public String toString(){
		return "����: " + title + ", ����: " + director + ", ���ۻ�: " + make;
	}
	public Movie(){
		title = "��¡�����";
		director = "�̼���";
		make = "��Ű��Ʃ���";
	}
	public Movie(String title, String director, String make){
		this.title = title;
		this.director = director;
		this.make = make;
	}
	public Movie(String title, String director){
		this.title = title;
		this.director = director;
		make = "��Ű��Ʃ���";
	}
	public Movie(String make){
		title = "��¡�����";
		director = "�̼���";
		this.make = make;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getTitle(){
		return title;
	}
	public void setDirector(String director){
		this.director = director;
	}
	public String getDirector(){
		return director;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}
}
class  MovieTest
{
	public static void main(String[] args) 
	{
		Movie m1 = new Movie();
		Movie m2 = new Movie("��Ȧ", "������", "Ű��Ʃ���");
		Movie m3 = new Movie("����","��ö��");
		Movie m4 = new Movie("�ܵ�Ʃ���");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

		m1.setTitle("����");
		System.out.println(m1);

		m2.setDirector("������");
		System.out.println(m2);
	}
}
