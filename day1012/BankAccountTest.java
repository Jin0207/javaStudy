class BankAccount
{
	private String name;
	private String accountNo;
	private int balance;
	private double i;
	
	public String toString(){
		return "�̸�: " + name + ", ���¹�ȣ: " +  accountNo + "\n �ܾ�: " + balance + ", ������: " + i;
	}
	BankAccount(){
		
	}
	BankAccount(String name, String accountNo, int balance, double i){
		this.name = name;
		this.accountNo = accountNo;
		this.balance = balance;
		this.i = i;
	}
	
}
class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount b1 = new BankAccount("����", "110-424-7878", 50000,0.075);
		BankAccount b2 = new BankAccount();

		System.out.println(b1);
		System.out.println(b2);
	}
}
