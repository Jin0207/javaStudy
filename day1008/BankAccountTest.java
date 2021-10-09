class BankAccount
{
	double balance; //잔액표시
	void setDeposit(int amount){ //저금
		balance += amount;
		return;
	}
	void setWithdraw(int amount){ //인출
		if(balance < amount){
			System.out.printf("현재 잔액이 %.1f 원이므로 %d 원을 인출할 수 없습니다.%n", balance, amount);
		}
		else{
			balance -= amount;
		}
	}
	double getBalance(){
		return balance;
	}
	void printBalance(){
		System.out.println("잔액: " + getBalance());
	}
	double addInterest(){
		double i = balance * 0.075;
		balance += i;
		return balance;	
	}
}
public class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		a1.balance = 100;
		a1.setWithdraw(60);
		a1.printBalance();

		BankAccount a2 = new BankAccount();
		a2.balance = 50;
		a2.setWithdraw(80);
		a2.printBalance();
		System.out.println(a2.addInterest());
	}
}
