class BankAccount
{
	private int balance; //잔액표시
	public void deposit(int amount){ //저금
		balance += amount;
		//return;
	}
	public void withdraw(int amount){ //인출
		if(balance < amount){
			System.out.printf("현재 잔액이 %.1f 원이므로 %d 원을 인출할 수 없습니다.%n", balance, amount);
		}
		else{
			balance -= amount;
		}
	}
	public int getBalance(){
		return balance;
	}
	public void printBalance(){
		System.out.printf("현재잔액: %d%n" , balance);
	}
	public void addInterest(){
		//balance = balance + balance * 0.075;
		// balance = balance * 1.075;
		balance *= 1.075;
	}
}

public class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);

		a1.withdraw(60);
		a2.withdraw(30);

		System.out.println(a1.getBalance());
		System.out.println(a2.getBalance());

		a1.printBalance();
		a2.printBalance();

		a1.addInterest();
		a2.addInterest();

		a1.printBalance();
		a2.printBalance();

	}
}
