class Bird{
	protected String name;
	protected String color;
	protected boolean wing;
	public Bird(String color, String name, boolean wing){
		this.name = name;
		this.color = color;
		this.wing = wing;
	}
	public Bird(){
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setWing(boolean wing){
		this.wing = wing;
	}
	public boolean getWing(){
		return wing;
	}
	public void fly(){
		if (wing){
			System.out.printf("%s?? %s??(??) ??~??~%n", color, name);
		}else{
			System.out.printf("%s?? %s?? ?? ?? ??????%n", color, name);
		}
	}
}

class Airplane extends Bird{
	private boolean engine;

	public Airplane(String color, String name, boolean wing, boolean engine){
		super(color, name, wing);
		this.engine = engine;
	}
	public Airplane(){
	}
	public void setEngine(boolean engine){
		this.engine = engine;
	}
	public boolean getEngine(){
		return engine;
	}
	public void fly(){
		if (wing && engine){
			System.out.printf("%s?? %s??(??) ??~??~%n", color, name);
		}else{
			System.out.printf("%s?? %s?? ?? ?? ??????%n", color, name);
		}
	}
}
class BirdTestOverriding{
	public static void main(String[] args) 
	{
		Bird b1 = new Bird("Ȳ??", "????", true);
		Bird b2 = new Bird("??", "???ѱ?", false);

		b1.fly();
		b2.fly();

		Airplane a1 =new Airplane("?ϴ?","????747", true, true);
		a1.fly();
	}
}
