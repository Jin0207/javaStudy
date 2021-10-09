class BankAccount
{
	double balance; //�ܾ�ǥ��
	void setDeposit(int amount){ //����
		balance += amount;
		return;
	}
	void setWithdraw(int amount){ //����
		if(balance < amount){
			System.out.printf("���� �ܾ��� %.1f ���̹Ƿ� %d ���� ������ �� �����ϴ�.%n", balance, amount);
		}
		else{
			balance -= amount;
		}
	}
	double getBalance(){
		return balance;
	}
	void printBalance(){
		System.out.println("�ܾ�: " + getBalance());
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
