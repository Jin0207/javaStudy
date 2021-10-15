/*
   �ڵ����� ��Ÿ���� Car��� �̸��� Ŭ������ �����϶�.
    ������, �𵨸�, ���ǹ� ����, ���Կ����� ��Ÿ���� �ʵ带 ������.
	���ǹ� ������ �밳 4���̴�.
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
		return "[�ڵ��� ������: " + make + ", �𵨸�: " + model + ", ���ǰ���: " + door + ", ���Կ���: " + purchase + ", ����:" + price + "����" + "]";
	}

	//������ ������
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
	//���� ������ 1�� �����ɶ����� ������ 500���� �����Ǵ� �޼���
	public static void minusPrice(int purchase, int price){
		Date today = new Date();
		purchase = today.getYear() + 1900 - purchase;
		price = price - (500*purchase);
		System.out.println("������ " + purchase + "�� ���� �߰����� " + price + "����");
	}
	//Car ��ü�� �Ű������� ���޹޾� ���Կ����� -1�����ϴ� �޼���
	public static void revisePurchase(Car c){
		c.setPurchase(c.getPurchase() - 1);
	}

	public static void main(String[] args) 
	{
		Car c1 = new Car("���", "ī�Ϲ�", 2022, 4380);
		Car c2 = new Car("�̴�", "F56", 2, 2020, 3800);

		System.out.println(c1);
		System.out.println(c2);
		 minusPrice(c2.getPurchase(), c2.getPrice());
		 System.out.println("���Կ���: " + c2.getPurchase() + "���Ű���: " + c2.getPrice() );
		 revisePurchase(c1);
		 System.out.println("���Կ����� ������ ");
		 System.out.println(c1);

	}
}
