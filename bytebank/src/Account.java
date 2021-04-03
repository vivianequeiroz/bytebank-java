public class Account {
	
	private double balance;
	private int agency;
	private int number;
	private String holder;
    private int total;
	
    public Account(int agency, int number) {
        this.agency = agency;
        this.number = number;
    }
	
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
        if(agence <= 0) {
            System.out.println("Não é aceito valores menores ou iguais a 0");
            return;
        }
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
