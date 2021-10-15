class Foods
{
	protected double calor;
	protected int price;
	protected double weight;

	public void setCalor(double calor){
		this.calor = calor;
	}
	public double getCalor(){
		return calor;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return weight;
	}
}
class Melon extends Foods
{
	private String farm;

	public void setFarm(String farm){
		this.farm = farm;
	}
	public String getFarm(){
		return farm;
	}

	public void printMelon(){
		System.out.printf("¸á·ÐÀÇ Ä®·Î¸®: %.2f%n", calor);
		System.out.printf("¸á·ÐÀÇ °¡°Ý: %d ¿ø %n", price);
		System.out.printf("¸á·ÐÀÇ ¹«°Ô: %.2f kg%n", weight);
		System.out.printf("¸á·ÐÀÇ °æÀÛ³ó¿øÁ¤º¸: %s%n", farm);
	}
}
class  InheritanceTestMelon
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCalor(600);
		m.setPrice(3500);
		m.setWeight(10);
		m.setFarm("°­¿øµµ ¿øÁÖ ¹«¸ª³ó¿ø");

		m.printMelon();
	}
}
