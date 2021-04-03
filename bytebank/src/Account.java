public class Account {
	
	double balance;
	int agency;
	int number;
	String holder;
	
	
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

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }

    public Customer getHolder() {
        return this.holder;
    }
}
