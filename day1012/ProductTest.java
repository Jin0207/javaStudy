// ��ǰ Ŭ������ ����� 
//��ǰ�̸�, ����, �ܰ���� �Ӽ��� ������ �ִ�. -- ���м� ����(private����)
// setter�� getter �����
class Product
{
	private String item;
	private int amount;
	private int price;
	
	public void setPrice(int p){
		price = p;
	}
	public int getPrice(){
		return price;
	}
	public void setAmount(int a){
		amount = a;
	}
	public int getAmount(){
		return amount;
	}
	public void setItem(String s){
		item = s;
	}
	public String getItem(){
		return item;
	}

	public String toString(){
		//return "��ǰ��: " + getItem() + ", ����: " + getAmount() + ", ����: " + getPrice();
		String result ="";
		result += "��ǰ��: " + item + "\n";
		result += "����: " + amount + "\n";
		result += "����: " + price + "\n";
		return result;
	}
}

class  ProductTest
{
	public static void main(String[] args) 
	{
		Product p = new Product();
		p.setItem("����");
		p.setAmount(2);
		p.setPrice(1000);
		/*
		System.out.println(p.getItem());
		System.out.println(p.getAmount());
		System.out.println(p.getPrice());
		toString()���� ��ȯ�̵ǵ���
		*/
		System.out.print(p);
		//= System.out.print(p.toString());

		int tot = p.getAmount() * p.getPrice();
		System.out.println(tot);
	}
}
