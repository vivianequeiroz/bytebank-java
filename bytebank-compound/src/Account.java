public class Account {
	
	private double balance;
	int agency;
	int number;
	Customer holder;
	
	
	public void deposit(double amount) {
		this.balance += amount;
	}

    public boolean withdrawMoney(double value) {
        if(this.balance >= value ) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destination){
        if(this.balance >= value) {
            this.balance -= value;
            destination.withdrawMoney(value);
            destination.balance += value;
        }
           return false;
        }

    public double getBalance() {
        return this.balance;
    }
}
