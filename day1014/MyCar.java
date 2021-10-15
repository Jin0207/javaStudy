/*
   자동차를 나타내는 Car라는 이름의 클래스를 설계하라.
    제조사, 모델명, 차의문 개수, 구입연도를 나타내는 필드를 가진다.
	차의문 개수는 대개 4개이다.
*/
import java.util.Date;
class Car
{
	private String make;
	private String model;
	public int door;
	private int purchase;
	private int price;

	Car(){
		door = 4;
	}

	Car(String make, String model, int door, int purchase, int price){
		this(make, model, purchase, price);
		this.door = door;
	}

	Car(String make, String model, int purchase, int price){
		this.make = make;
		this.model = model;
		door = 4;
		this.purchase = purchase;
		this.price = price;
	}

	public String toString(){
		return "[자동차 제조사: " + make + ", 모델명: " + model + ", 문의개수: " + door + ", 구입연도: " + purchase + ", 가격:" + price + "만원" + "]";
	}

	//설정자 제어자
	public void setMake(String make){
		this.make = make;
	}
	public String getMake(){
		return make;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setDoor(int door){
		this.door = door;
	}
	public int getDoor(){
		return door;
	}
	public void setPurchase(int purchase){
		this.purchase = purchase;
	}
	public int getPurchase(){
		return purchase;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public int getPrice(){
		return price;
	}
}

class  MyCar
{	
	//차의 연식이 1씩 증가될때마다 가격이 500만원 감가되는 메서드
	public static void minusPrice(int purchase, int price){
		Date today = new Date();
		purchase = today.getYear() + 1900 - purchase;
		price = price - (500*purchase);
		System.out.println("연식이 " + purchase + "된 차의 중고가격은 " + price + "만원");
	}
	//Car 객체를 매개변수로 전달받아 구입연도를 -1수정하는 메서드
	public static void revisePurchase(Car c){
		c.setPurchase(c.getPurchase() - 1);
	}

	public static void main(String[] args) 
	{
		Car c1 = new Car("기아", "카니발", 2022, 4380);
		Car c2 = new Car("미니", "F56", 2, 2020, 3800);

		System.out.println(c1);
		System.out.println(c2);
		 minusPrice(c2.getPurchase(), c2.getPrice());
		 System.out.println("구입연도: " + c2.getPurchase() + "구매가격: " + c2.getPrice() );
		 revisePurchase(c1);
		 System.out.println("구입연도를 수정함 ");
		 System.out.println(c1);

	}
}
