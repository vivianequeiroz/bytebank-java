public class Account {
	
	private double balance;
	private int agency;
	private int number;
	private Customer holder;
	
	
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

    public void setNumber(int newNumber) {
        this.number = newNumber;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int newAgency) {
        this.agency = newAgency;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(Customer holder) {
        this.holder = holder;
    }
}
