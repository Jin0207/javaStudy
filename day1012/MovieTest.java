class Movie
{
	private String title;
	private String director;
	private String make;

	public String toString(){
		return "Á¦¸ñ: " + title + ", °¨µ¶: " + director + ", Á¦ÀÛ»ç: " + make;
	}
	public Movie(){
		title = "¿ÀÂ¡¾î°ÔÀÓ";
		director = "ÀÌ¼ø½Å";
		make = "ÄíÅ°½ºÆ©µð¿À";
	}
	public Movie(String title, String director, String make){
		this.title = title;
		this.director = director;
		this.make = make;
	}
	public Movie(String title, String director){
		this.title = title;
		this.director = director;
		make = "ÄíÅ°½ºÆ©µð¿À";
	}
	public Movie(String make){
		title = "¿ÀÂ¡¾î°ÔÀÓ";
		director = "ÀÌ¼ø½Å";
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
		Movie m2 = new Movie("¸ÇÈ¦", "¹ÚÁ¤¿ì", "Å°Äí½ºÆ©µð¿À");
		Movie m3 = new Movie("±«¹°","±èÃ¶¼ö");
		Movie m4 = new Movie("ÀÜµð½ºÆ©µð¿À");

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

		m1.setTitle("¹°±«");
		System.out.println(m1);

		m2.setDirector("À¯°ü¼ø");
		System.out.println(m2);
	}
}
