//������ �����ڸ� �ߺ������Ͽ� Ŭ������ ���鵵���Ͽ� ��ü �����ÿ� �Ӽ����� �� �ʱ�ȭ
class Foods
{
	protected double calor;
	protected int price;
	protected double weight;

	public Foods(){
	}
	public Foods(double calor, int price, double weight){
		this.calor = calor;
		this.price = price;
		this.weight = weight;
	}
	//setter, getter
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
	public String toString(){
		return "Į�θ�: " + calor + ", ����: " + price + ", �߷�: " + weight;
	}
}
class Melon extends Foods
{
	private String farm;

	Melon(){
		super();
	}
	Melon(double calor, int price, double weight, String farm){
		super(calor, price, weight);
		this.farm = farm;
	}
	public void setFarm(String farm){
		this.farm = farm;
	}
	public String getFarm(){
		return farm;
	}
	public String toString(){
		//return "Į�θ�: " + calor + ", ����: " + price + ", �߷�: " + weight + ", ���۳��: " + farm;
		return super.toString() + ", ���۳��: " + farm;
	}
}

class  InheritanceTestMelon03
{
	public static void main(String[] args) 
	{
		Foods f = new Foods(200,3000,0.6);
		Melon m = new Melon(360, 38000, 36.5, "�ֿ���");

		System.out.println(f);
		System.out.println(m);
		
	}
}
