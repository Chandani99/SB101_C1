package Question3;

public class Account {
	int balance ;
	int accountNo ;
	public void displayBalance() {
		System.out.println("A/C number: "+accountNo+" balance is : "+balance);
	}
	public synchronized void deposit(int amount) {
		balance+= amount;
		System.out.println(amount+" is deposited " );
		displayBalance();
	}
	public synchronized void  withdraw(int amount) {
		balance-=amount;
		System.out.println(amount+" is withdrawn " );
		displayBalance();
	}
}
