// 상품 클래스를 만들어 
//상품이름, 수량, 단가라는 속성을 가지고 있다. -- 은닉성 적용(private영역)
// setter와 getter 만들기
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
		//return "상품명: " + getItem() + ", 수량: " + getAmount() + ", 가격: " + getPrice();
		String result ="";
		result += "상품명: " + item + "\n";
		result += "수량: " + amount + "\n";
		result += "가격: " + price + "\n";
		return result;
	}
}

class  ProductTest
{
	public static void main(String[] args) 
	{
		Product p = new Product();
		p.setItem("모자");
		p.setAmount(2);
		p.setPrice(1000);
		/*
		System.out.println(p.getItem());
		System.out.println(p.getAmount());
		System.out.println(p.getPrice());
		toString()만들어서 반환이되도록
		*/
		System.out.print(p);
		//= System.out.print(p.toString());

		int tot = p.getAmount() * p.getPrice();
		System.out.println(tot);
	}
}
