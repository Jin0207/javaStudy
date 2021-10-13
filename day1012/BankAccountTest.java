class BankAccount
{
	private String name;
	private String accountNo;
	private double balance;
	private double rate;

	public void setRate(double rate){
		this.rate = rate;
	}
	public double getRate(){
		return rate;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	}
	public String getAccountNo(){
		return acoountNo
	}
	public void setName(String name){
		this.name = naem;
	}
	public String getname(){
		return name;
	}

	public String toString(){
		return "[이름: " + name + ", 계좌번호: " +  accountNo + "\n 잔액: " + balance + ", 이자율: " + rate + "]";
	}
	BankAccount(){
		
	}
	BankAccount(String name, String accountNo, double balance, double i){
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		this.rate = rate;
	}
	
}
class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount("상진", "110-424-7878", 50000,0.075);
		BankAccount b2 = new BankAccount();

		System.out.println(b1);
		System.out.println(b2);
	}
}
