public class Account {
	
	double balance;
	int agency;
	int number;
	String holder;
	
	
	void deposit(double amount) {
		this.balance += amount;
	}
}
