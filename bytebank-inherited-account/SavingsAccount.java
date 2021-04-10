public class SavingsAccount extends Account {
	
	public SavingsAccount(int agency, int number) {
		super(agency, number);
	}

	@Override
	public void deposit(double value) {
		super.balance += value;
	}
}
