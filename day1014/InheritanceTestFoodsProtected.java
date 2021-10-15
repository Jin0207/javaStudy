/*음식을 나타내는 Foods클래스를 만들어보시오.
   Food를 상속받은 Melon클래스를 만들어보시오.
   Food클래스는 칼로리,가격,중량의 속성을 갖고 있다.
   Melon클래스는 추가로 경작 농원 정보를 갖도록 하고
   Melon의 모든 정보를 출력하는 메서드를 정의하세요.
	Melon객체를 생성하고 각 속성을 설정하고 정보 출력
*/
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
		System.out.printf("멜론의 칼로리: %.2f%n", calor);
		System.out.printf("멜론의 가격: %d 원 %n", price);
		System.out.printf("멜론의 무게: %.2f kg%n", weight);
		System.out.printf("멜론의 경작농원정보: %s%n", farm);
	}
}
class  InheritanceTestFoodsProtected
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCalor(600);
		m.setPrice(3500);
		m.setWeight(10);
		m.setFarm("강원도 원주 무릉농원");

		m.printMelon();
	}
}
